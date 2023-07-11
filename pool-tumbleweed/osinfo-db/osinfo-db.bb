SUMMARY = "Osinfo database files"
DESCRIPTION = "The osinfo database provides information about operating systems and \
hypervisor platforms to facilitate the automated configuration and \
provisioning of new virtual machines"
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "20230518"

RPM_NAME = "osinfo-db-20230518-1.1.noarch.rpm"
RPM_HASH = "20a9bdf54fa6598865ebbf92280444bc76294ea32d435055026647e91e35b804c4def4e83367249bdf06c209673561f598aa0b55b524194c705da41fcde81169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osinfo-db"

RDEPENDS:${PN} += ""

inherit rpm
