SUMMARY = "Qt5 backend for python39-matplotlib"
DESCRIPTION = "This package includes the Qt5-based pyqt5 backend \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-qt5-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "20e7f8c863549939be5034d90f0cdfacfa78c4183dda6c71178cfd5e287ccdf01f541d6bbd1afc3198eaec91f3cdb6fd0ea7c2eb770f501472a1457a36c6c91d"

RPROVIDES:${PN} += "python39-matplotlib-qt-shared \
python39-matplotlib-qt5"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-qt5"

inherit rpm
