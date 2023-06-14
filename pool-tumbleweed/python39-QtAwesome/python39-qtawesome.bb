SUMMARY = "FontAwesome icons in PyQt and PySide applications"
DESCRIPTION = "QtAwesome enables iconic fonts such as Font Awesome and \
Elusive Icons in PyQt and PySide applications. \
 \
It is a port to Python - PyQt / PySide of the QtAwesome C++ \
library by Rick Blommers."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-QtAwesome-1.2.1-1.5.noarch.rpm"
RPM_HASH = "7bbda549df9326fadb4de5053e17ef858d4df7adcd7875572ab79f0e5d249f51fab0748b66c82c5e9a8d8d2beacbe25703723807a74c9e18b42f03bbd67afdc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qtawesome \
python39-QtAwesome \
python3dist-qtawesome"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-QtPy \
update-alternatives"

inherit rpm
