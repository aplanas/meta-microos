SUMMARY = "Qt5 backend for python310-matplotlib"
DESCRIPTION = "This package includes the Qt5-based pyqt5 backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-qt5-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "f99b9660e8cf3fd4d9b39bbacad0e89471a5d1ef07a6aa21ed3fdf2296c2430c1cbacb3f0f429f4c176032d3b07e1df464d93d325de313ae7bc63c35789422c6"

RPROVIDES:${PN} += "python310-matplotlib-qt-shared \
python310-matplotlib-qt5"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-qt5"

inherit rpm
