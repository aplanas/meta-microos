SUMMARY = "Python 3 module to generate QR Codes"
DESCRIPTION = "The PyQRCode module is a QR code generator that is simple to use and written in pure python. \
The module can automates most of the building process for creating QR codes. \
Most codes can be created using only two lines of code."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python311-PyQRCode-1.3.6-4.1.noarch.rpm"
RPM_HASH = "929d928d6a74bace706a2e3a4d629876d9d9618da9dcbea5a421f4656631f352c718b94135d46aa2179e3f7c3c0aefa1b621cc4ddf5b6f88cd9163f0591735fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pyqrcodeng \
python311-PyQRCode \
python311-PyQRCodeNG \
python311-pyqrcodeng \
python3dist-pyqrcodeng"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
update-alternatives"

inherit rpm
