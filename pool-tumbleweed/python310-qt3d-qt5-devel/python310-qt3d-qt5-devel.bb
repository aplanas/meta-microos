SUMMARY = "Development files for python310-qt3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and the Qt5 3D framework API files for the Eric IDE for python310-qt3d-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qt3d-qt5-devel-5.15.6-1.6.aarch64.rpm"
RPM_HASH = "6d2dd454bcd8c902328551c9bcde73d974c5a5946a0ac190dd6b170f2396224ef41e022cc3c5657c4319f5e81949ca75e46491adb5491d9896685308f787c26e"

RPROVIDES:${PN} += "python-qt3d-qt5-api \
python-qt3d-qt5-sip \
python3-qt3d-qt5-api \
python3-qt3d-qt5-devel \
python3-qt3d-qt5-sip \
python310-qt3d-qt5-api \
python310-qt3d-qt5-devel \
python310-qt3d-qt5-devel(aarch-64) \
python310-qt3d-qt5-sip"

RDEPENDS:${PN} += "python(abi) \
python310-qt5-devel"

inherit rpm
