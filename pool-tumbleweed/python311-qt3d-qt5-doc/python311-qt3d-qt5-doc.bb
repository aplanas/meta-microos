SUMMARY = "Examples for python311-qt3d-qt5"
DESCRIPTION = "This package provides python311-qt3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python311-qt3d-qt5-doc-5.15.6-1.8.noarch.rpm"
RPM_HASH = "7309a35c4da47706e507bbc655d4c86f91306e1f9cc64630560079d316bee06603f9b7f2a6693da2514f02f7ec588dbd0d9e7095cda96eaf9b910bc48fbcf97c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-qt3d-qt5-doc \
python310-qt3d-qt5-examples \
python311-qt3d-qt5-doc \
python311-qt3d-qt5-examples \
python39-qt3d-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
