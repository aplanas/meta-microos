SUMMARY = "Standalone binfmt_misc support for Windows"
DESCRIPTION = "Standalone variant for running Windows(tm) executables out of the box. \
This package does not depend on systemd and dbus, which may not be \
available on obs workers for example."
LICENSE = "GPL-2.0"

PV = "1.2.1"

RPM_NAME = "wine-binfmt-standalone-1.2.1-1.2.noarch.rpm"
RPM_HASH = "86904c11e0364df2e2bd96d59207b43162256ece65a523968aa25c4506dbeb7e218573247db29566493fbe0f0726c306e4f4db833391a3cb8bb340c11d7a0684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wine-binfmt-standalone"

RDEPENDS:${PN} += "/bin/sh \
wine-binfmt"

inherit rpm
