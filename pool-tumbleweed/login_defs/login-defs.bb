SUMMARY = "The login.defs configuration file"
DESCRIPTION = "This package contains the default login.defs configuration file \
as used by util-linux, pam and shadow."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "login_defs-4.14.0-1.1.noarch.rpm"
RPM_HASH = "d0c5d1d82b6d2bc6be34c4ae6fdde8a9782e68bb4cf25bf3a368edd5bffca5cd4c285fd9bc2ad949d94826c33166d6b6f8f2a7f29d6e9a8fd6857ddb321189c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "login-defs \
login-defs-support-for-pam \
login-defs-support-for-util-linux"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
