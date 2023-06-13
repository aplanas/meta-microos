SUMMARY = "Qt5 backend for python310-matplotlib"
DESCRIPTION = "This package includes the Qt5-based pyqt5 backend \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-qt5-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "28a696b3bf6e6d77230a286620a44c333a86693ff8c0ba4a61c092aa814254a6e6828dd1e29ad8ab145fa6f1f47373c2f9ca682427edda9d544c3b160f042f23"

RPROVIDES:${PN} += "python3-matplotlib-qt-shared \
python3-matplotlib-qt5 \
python310-matplotlib-qt-shared \
python310-matplotlib-qt5 \
python310-matplotlib-qt5(aarch-64)"

RDEPENDS:${PN} += "python(abi) \
python310-matplotlib \
python310-qt5"

inherit rpm
