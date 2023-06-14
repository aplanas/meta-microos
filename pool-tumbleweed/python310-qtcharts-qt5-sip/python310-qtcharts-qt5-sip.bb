SUMMARY = "Sip files for python310-qtcharts-qt5"
DESCRIPTION = "This package provides the SIP files used to generate the Python bindings for \
python310-qtcharts-qt5"
LICENSE = "GPL-3.0-only"

PV = "5.15.6"

RPM_NAME = "python310-qtcharts-qt5-sip-5.15.6-1.12.aarch64.rpm"
RPM_HASH = "3fd52c438d5ce78f7697527a6a4995f86e3263562cfc3db1e34204be6bdf9ff28870d1f2436fded332888da943ed032ada8d2fcb111d0814636a2933c639f8b2"

RPROVIDES:${PN} += "python-qtcharts-qt5-sip \
python3-qtcharts-qt5-sip \
python310-qtcharts-qt5-sip"

RDEPENDS:${PN} += "python310-qt5-devel"

inherit rpm
