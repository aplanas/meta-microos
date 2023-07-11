SUMMARY = "Python 3 module to generate QR Codes"
DESCRIPTION = "The PyQRCode module is a QR code generator that is simple to use and written in pure python. \
The module can automates most of the building process for creating QR codes. \
Most codes can be created using only two lines of code."
LICENSE = "MIT"

PV = "1.3.6"

RPM_NAME = "python310-PyQRCode-1.3.6-4.3.noarch.rpm"
RPM_HASH = "46265366ff7cb6060537cdc99d27280df8410515dad794990777aded655da7b5327cb262da205c42897e8aa0bf74f613f1e88edf0d441fe2a897f3158709e33a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyqrcodeng \
python310-PyQRCode \
python310-PyQRCodeNG \
python310-pyqrcodeng \
python3dist-pyqrcodeng"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
