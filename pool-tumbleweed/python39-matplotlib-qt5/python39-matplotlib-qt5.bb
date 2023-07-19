SUMMARY = "Qt5 backend for python39-matplotlib"
DESCRIPTION = "This package includes the Qt5-based pyqt5 backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-qt5-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "55010e7cffbef1a52f108d59a39d193f8fd2028bf31c8a480af6b8f85fffdd4906397514294ae12bdcb41dc932f8cd34ade8eb82806edaac6ae82479d54bc15e"

RPROVIDES:${PN} += "python39-matplotlib-qt-shared \
python39-matplotlib-qt5"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-qt5"

inherit rpm
