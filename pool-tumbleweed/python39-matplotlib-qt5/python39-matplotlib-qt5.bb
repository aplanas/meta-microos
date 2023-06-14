SUMMARY = "Qt5 backend for python39-matplotlib"
DESCRIPTION = "This package includes the Qt5-based pyqt5 backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-qt5-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "a1a6cab59d6c6c87143e449a9330de6dd586d6127415ba9f4dff26f57b006b29fd6805898d269c0a8fde7c4ac5120df961e7f414f91637e913b8678b5a3ff9e7"

RPROVIDES:${PN} += "python39-matplotlib-qt-shared \
python39-matplotlib-qt5"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-qt5"

inherit rpm
