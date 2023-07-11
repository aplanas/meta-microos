SUMMARY = "The login.defs configuration file"
DESCRIPTION = "This package contains the default login.defs configuration file \
as used by util-linux, pam and shadow."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.13"

RPM_NAME = "login_defs-4.13-6.3.noarch.rpm"
RPM_HASH = "33f6686cb5d671d65a9f940d2e74ef12b8ad1ce10c9daebf67a06e39c933d1d31078ab7f1e77cb440408007c47c061ec32e468b98f296ac6a7bb5dde0e9ec924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "login-defs \
login-defs-support-for-pam \
login-defs-support-for-util-linux"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
