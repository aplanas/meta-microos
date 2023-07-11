SUMMARY = "Documentation files for byobu"
DESCRIPTION = "Help files and changelog for byobu."
LICENSE = "GPL-3.0-only"

PV = "5.133"

RPM_NAME = "byobu-doc-5.133-2.13.noarch.rpm"
RPM_HASH = "0147252749733f4bfc56843c86ab133791eddfba5574c6a7b02b1b8b9be437c5807a3dab40b6a72a32b0ccf46b38df48c0e92780db3b37e10d616b3463a6dc64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byobu-doc"

RDEPENDS:${PN} += "byobu"

inherit rpm
