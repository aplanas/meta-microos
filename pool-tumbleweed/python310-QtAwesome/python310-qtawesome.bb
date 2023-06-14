SUMMARY = "FontAwesome icons in PyQt and PySide applications"
DESCRIPTION = "QtAwesome enables iconic fonts such as Font Awesome and \
Elusive Icons in PyQt and PySide applications. \
 \
It is a port to Python - PyQt / PySide of the QtAwesome C++ \
library by Rick Blommers."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-QtAwesome-1.2.1-1.5.noarch.rpm"
RPM_HASH = "bc3e6d2a9b91a03ce6c22daf385fead4c8ead4560dc3dc99519f5a3977c9cdbcde96ec831655385bae41620cc23bfdce27a153fee0bc078f1799d4b66e3e2c8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QtAwesome \
python3.10dist-qtawesome \
python310-QtAwesome \
python3dist-qtawesome"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-QtPy \
update-alternatives"

inherit rpm
