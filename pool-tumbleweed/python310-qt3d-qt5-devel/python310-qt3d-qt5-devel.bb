SUMMARY = "Development files for python310-qt3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and the Qt5 3D framework API files for the Eric IDE for python310-qt3d-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qt3d-qt5-devel-5.15.6-1.8.aarch64.rpm"
RPM_HASH = "2d6671b8edad6fcf8a848661b3024b0dbb7df1c187be545f1a0230a9518bc4601db9a60e442a3b3bccb377a1466a30ee1584c217294209c4b525645273a13b8a"

RPROVIDES:${PN} += "python-qt3d-qt5-api \
python-qt3d-qt5-sip \
python310-qt3d-qt5-api \
python310-qt3d-qt5-devel \
python310-qt3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python310-qt5-devel"

inherit rpm
