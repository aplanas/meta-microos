SUMMARY = "Examples for python311-qtdatavis3d-qt5"
DESCRIPTION = "This package provides python311-qtdatavis3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python311-qtdatavis3d-qt5-doc-5.15.5-1.6.noarch.rpm"
RPM_HASH = "52bf0ab271ed458eefb148a08ee53013bbfb7a9a49bff41050c848399aee218e546aad1f7a50995c2ec52e69eb344c26e3839eb9d20177dd3b038d60da1c4474"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qtdatavis3d-qt5-doc \
python310-qtdatavis3d-qt5-examples \
python311-qtdatavis3d-qt5-doc \
python311-qtdatavis3d-qt5-examples \
python39-qtdatavis3d-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
