SUMMARY = "Development files for python39-qt3d-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings \
and the Qt5 3D framework API files for the Eric IDE for python39-qt3d-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python39-qt3d-qt5-devel-5.15.6-1.6.aarch64.rpm"
RPM_HASH = "0791117c4a95e9d4db78cada2502c855ba1a8d6ff2a7207b530b6c230ac5bf2124876a0dbf8d900a9f3809b9acd84e3223e897b45db950d18a9bab5a1d0e5a53"

RPROVIDES:${PN} += "python-qt3d-qt5-api \
python-qt3d-qt5-sip \
python39-qt3d-qt5-api \
python39-qt3d-qt5-devel \
python39-qt3d-qt5-sip"

RDEPENDS:${PN} += "python-abi \
python39-qt5-devel"

inherit rpm
