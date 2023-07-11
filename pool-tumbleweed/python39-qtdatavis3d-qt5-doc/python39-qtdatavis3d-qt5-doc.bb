SUMMARY = "Examples for python39-qtdatavis3d-qt5"
DESCRIPTION = "This package provides python39-qtdatavis3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python39-qtdatavis3d-qt5-doc-5.15.5-1.6.noarch.rpm"
RPM_HASH = "20ba4ee3a8deb75f054f6ee543dbd53ac1be398aab3256256ccf74b9fbb4d055ddfd169535fec16b2f631913c7517a999040f560cfae72257a1820c4624de6cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qtdatavis3d-qt5-examples \
python311-qtdatavis3d-qt5-examples \
python39-qtdatavis3d-qt5-doc \
python39-qtdatavis3d-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
