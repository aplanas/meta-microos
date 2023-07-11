SUMMARY = "Examples for python39-qt3d-qt5"
DESCRIPTION = "This package provides python39-qt3d-qt5 examples."
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qt3d-qt5-doc-5.15.6-1.8.noarch.rpm"
RPM_HASH = "cc3d1cd3913789b4d3c7fbd2b1eb62e0a1ceb839838fa31765166cda0627dbc3236788e3662dfca951f0f877b04403b4dd696be223d3f76a0a15a0e0a2d9077c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-qt3d-qt5-examples \
python311-qt3d-qt5-examples \
python39-qt3d-qt5-doc \
python39-qt3d-qt5-examples"

RDEPENDS:${PN} += ""

inherit rpm
