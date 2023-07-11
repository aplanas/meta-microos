SUMMARY = "Qt5 backend for python311-matplotlib"
DESCRIPTION = "This package includes the Qt5-based pyqt5 backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-qt5-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "66fb72b9e923d2c8ae7327a454a893fba4530cd850c3ff98300502c9fbfc26a3d31a95982769b6aa3550add6c7c66f4bac539851ab0444a40f506194cadb0aac"

RPROVIDES:${PN} += "python3-matplotlib-qt-shared \
python3-matplotlib-qt5 \
python311-matplotlib-qt-shared \
python311-matplotlib-qt5"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-qt5"

inherit rpm
