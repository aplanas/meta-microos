SUMMARY = "Documentation files for byobu"
DESCRIPTION = "Help files and changelog for byobu."
LICENSE = "GPL-3.0-only"

PV = "5.133"

RPM_NAME = "byobu-doc-5.133-2.12.noarch.rpm"
RPM_HASH = "2b7d74d1331f401833f3f27e72729d13a40d95a482786caffb65fbe33d65eb8d1cf7e1b858dddc1d9736a79423927f64e6e3dbc2219e3b66df3e220eb616b339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byobu-doc"

RDEPENDS:${PN} += "byobu"

inherit rpm
