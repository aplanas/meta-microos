SUMMARY = "Connman reference man pages"
DESCRIPTION = "Documentation in form of man pages for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-doc-1.41-4.8.aarch64.rpm"
RPM_HASH = "664451ed9e9ab9cd159a30021500368c25d74bb022ff92895896e123909b28276587ec350ed010414d3d4bb2d662c4b32851af5840fc1492a84b476cd329ff09"

RPROVIDES:${PN} += "connman-doc"

RDEPENDS:${PN} += ""

inherit rpm
