SUMMARY = "Common files for Icinga Web 2 and the Icinga CLI"
DESCRIPTION = "Common files for Icinga Web 2 and the Icinga CLI."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-common-2.11.4-3.1.noarch.rpm"
RPM_HASH = "8e2dbefece689e18cf186c14a07cf94ccc8364f8fd1483e56d11c3f6f73ff8d1005b08904f366b558a2ff5cc5a52dceb1ba86aafaf3b427dfa83cb8325f34354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-common"

RDEPENDS:${PN} += "/usr/bin/sh \
permissions \
pwdutils \
system-user-wwwrun"

inherit rpm
