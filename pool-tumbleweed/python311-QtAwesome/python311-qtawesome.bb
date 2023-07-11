SUMMARY = "FontAwesome icons in PyQt and PySide applications"
DESCRIPTION = "QtAwesome enables iconic fonts such as Font Awesome and \
Elusive Icons in PyQt and PySide applications. \
 \
It is a port to Python - PyQt / PySide of the QtAwesome C++ \
library by Rick Blommers."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python311-QtAwesome-1.2.1-2.3.noarch.rpm"
RPM_HASH = "a77c52b1982c5d906e1ef2cbb91ed8103d9ec14f8ee701e44bf9887aba00d784e3a9312c17ca8a24475213100d86562ccd59d122b4771925a7317d9bd52c831c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QtAwesome \
python3.11dist-qtawesome \
python311-QtAwesome \
python3dist-qtawesome"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-QtPy \
update-alternatives"

inherit rpm
