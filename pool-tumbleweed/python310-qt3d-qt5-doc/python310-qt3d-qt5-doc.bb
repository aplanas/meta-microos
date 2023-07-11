SUMMARY = "Examples for python310-qt3d-qt5"
DESCRIPTION = "This package provides python310-qt3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qt3d-qt5-doc-5.15.6-1.8.noarch.rpm"
RPM_HASH = "78daa3406b6d869d1be4f4a2239b5958a9ab2587557c5847595e18af57f9966c387f6ab0485da8da46bc0ff72cbb22044afc8eebe5ed3c5c42020e77fdd703a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qt3d-qt5-doc \
python310-qt3d-qt5-examples \
python311-qt3d-qt5-examples \
python39-qt3d-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
