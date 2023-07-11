SUMMARY = "Python 3 module to generate QR Codes"
DESCRIPTION = "The PyQRCode module is a QR code generator that is simple to use and written in pure python. \
The module can automates most of the building process for creating QR codes. \
Most codes can be created using only two lines of code."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python311-PyQRCode-1.3.6-4.3.noarch.rpm"
RPM_HASH = "1ed534e9eae42a149756f138eb9e837ffa7839c6ef29708c3c854f3d4fdac2ac33972f9f9f3f9f3dc503fa7079f091a6322c211e50d17e982b9de32d7f5efcfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyQRCode \
python3-PyQRCodeNG \
python3-pyqrcodeng \
python3.11dist-pyqrcodeng \
python311-PyQRCode \
python311-PyQRCodeNG \
python311-pyqrcodeng \
python3dist-pyqrcodeng"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
