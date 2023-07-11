SUMMARY = "Qt5 backend for python310-matplotlib"
DESCRIPTION = "This package includes the Qt5-based pyqt5 backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-qt5-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "4b17268c0d34bae799c7370ec5b771350c4525aae362a7ff74acb869a4fff0f2bcfa8635ee1047dee25b0c0910cac92f9aae690a3d35458edb901bbcd0277019"

RPROVIDES:${PN} += "python310-matplotlib-qt-shared \
python310-matplotlib-qt5"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-qt5"

inherit rpm
