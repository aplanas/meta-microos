SUMMARY = "Python 3 module to generate QR Codes"
DESCRIPTION = "The PyQRCode module is a QR code generator that is simple to use and written in pure python. \
The module can automates most of the building process for creating QR codes. \
Most codes can be created using only two lines of code."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python39-PyQRCode-1.3.6-4.3.noarch.rpm"
RPM_HASH = "3f90509afbbc5df1bf970c50428e186bb1582ade5a4bb3047aac21182955c4ca191ec5217f9fcd5573ea952c55744eecdebc32cd55586765dd823a7c636e143c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyqrcodeng \
python39-PyQRCode \
python39-PyQRCodeNG \
python39-pyqrcodeng \
python3dist-pyqrcodeng"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
