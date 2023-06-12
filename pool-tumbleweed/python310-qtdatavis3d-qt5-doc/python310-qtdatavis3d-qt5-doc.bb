SUMMARY = "Examples for python310-qtdatavis3d-qt5"
DESCRIPTION = "This package provides python310-qtdatavis3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python310-qtdatavis3d-qt5-doc-5.15.5-1.5.noarch.rpm"
RPM_HASH = "557ff6820338f26cd1189ed7b20514f3cd6246b2b2db6776a66aa69de0e96226a4d3fd6e35c3d6aee00257725761544f1b537a9958b639a08655a730e5622950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qtdatavis3d-qt5-doc \
python310-qtdatavis3d-qt5-doc \
python310-qtdatavis3d-qt5-examples \
python311-qtdatavis3d-qt5-examples \
python39-qtdatavis3d-qt5-examples"
RDEPENDS:${PN} += ""

inherit rpm
