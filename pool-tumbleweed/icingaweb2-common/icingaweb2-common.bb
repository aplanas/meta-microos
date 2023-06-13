SUMMARY = "Common files for Icinga Web 2 and the Icinga CLI"
DESCRIPTION = "Common files for Icinga Web 2 and the Icinga CLI."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-common-2.11.4-2.1.noarch.rpm"
RPM_HASH = "763463e927152316e7b94a9061748313a6e95b79b7b0aedc14dd4eada52e1b228c7a91638302b3b9cfdf399e4b614004629658aea5632ce9c2f0e599741db27c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-common"

RDEPENDS:${PN} += "/bin/sh \
permissions \
pwdutils \
system-user-wwwrun"

inherit rpm
