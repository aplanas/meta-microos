SUMMARY = "Files and Scripts for openSUSE MicroOS"
DESCRIPTION = "Files, scripts and directories for openSUSE MicroOS."
LICENSE = "GPL-2.0-or-later"

PV = "2.21+git0"

RPM_NAME = "microos-tools-2.21+git0-1.1.aarch64.rpm"
RPM_HASH = "bb1fc77df16990bca977229d17edc363a1b6c0adfc40f92b22a65d4333d1ce9e736de50d7358a8cb9c89b123b38f08fb945969c460efa5f60b5f12651433e8cb"

RPROVIDES:${PN} += "config-microos-tools \
microos-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
read-only-root-fs"

inherit rpm
