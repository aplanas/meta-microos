SUMMARY = "Development files for python39-qt3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and the Qt5 3D framework API files for the Eric IDE for python39-qt3d-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qt3d-qt5-devel-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "0fe5300656f0802c9ecb7a368186bddd20f7547335c45398d342f5cdc14d1eb875a9736cbef2044e8aca222f47038cf705df78c3bd7e6da6d308f1770348fb6e"

RPROVIDES:${PN} += "python-qt3d-qt5-api \
python-qt3d-qt5-sip \
python39-qt3d-qt5-api \
python39-qt3d-qt5-devel \
python39-qt3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python39-qt5-devel"

inherit rpm
