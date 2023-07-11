SUMMARY = "Files and Scripts for openSUSE MicroOS"
DESCRIPTION = "Files, scripts and directories for openSUSE MicroOS."
LICENSE = "GPL-2.0-or-later"

PV = "2.21+git0"

RPM_NAME = "microos-tools-2.21+git0-2.1.aarch64.rpm"
RPM_HASH = "f257d44ef6236e66adeee9caea0dff28b9475bd6487ae2d2b9c8d1e14563143a76973da5c53bf2a2600a5ce6dd08abd990e2b3b8e987544e9195f75675514e1e"

RPROVIDES:${PN} += "config-microos-tools \
microos-tools"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
read-only-root-fs"

inherit rpm
