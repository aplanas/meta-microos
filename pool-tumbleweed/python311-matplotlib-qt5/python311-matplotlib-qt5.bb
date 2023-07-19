SUMMARY = "Qt5 backend for python311-matplotlib"
DESCRIPTION = "This package includes the Qt5-based pyqt5 backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-qt5-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "e23631c700b8caf9aa8b6669397c4882ae50bba22652d0bcdaca738321007b6012d0019a4866fe82754ba0f29fa18765ee8f72cd45be4ad05e8764055f4775c1"

RPROVIDES:${PN} += "python3-matplotlib-qt-shared \
python3-matplotlib-qt5 \
python311-matplotlib-qt-shared \
python311-matplotlib-qt5"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-qt5"

inherit rpm
