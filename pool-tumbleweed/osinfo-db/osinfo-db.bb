SUMMARY = "Osinfo database files"
DESCRIPTION = "The osinfo database provides information about operating systems and \
hypervisor platforms to facilitate the automated configuration and \
provisioning of new virtual machines"
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "20230719"

RPM_NAME = "osinfo-db-20230719-1.1.noarch.rpm"
RPM_HASH = "10c8aba52eeed6d0bea8877455e30bbf8d145b5f2406919f5e0ed3a96aad615963ab8e0457502857b2bedaea29116d3ca006a92caf9ff208c607e0b45033de2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osinfo-db"

RDEPENDS:${PN} += ""

inherit rpm
