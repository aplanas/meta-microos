SUMMARY = "Examples for python310-qtdatavis3d-qt5"
DESCRIPTION = "This package provides python310-qtdatavis3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python310-qtdatavis3d-qt5-doc-5.15.5-1.6.noarch.rpm"
RPM_HASH = "0834bba3c21ab4a17b0ff227e7bf6a3d83a5eeef5d3708fc2876ddb56e0c9f59fc32ea669e2c3e6f53398a93c3e3e0b9db927ec8e8fe3758d429224631c8bf59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qtdatavis3d-qt5-doc \
python310-qtdatavis3d-qt5-examples \
python311-qtdatavis3d-qt5-examples \
python39-qtdatavis3d-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
