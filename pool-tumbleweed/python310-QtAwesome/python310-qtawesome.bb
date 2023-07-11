SUMMARY = "FontAwesome icons in PyQt and PySide applications"
DESCRIPTION = "QtAwesome enables iconic fonts such as Font Awesome and \
Elusive Icons in PyQt and PySide applications. \
 \
It is a port to Python - PyQt / PySide of the QtAwesome C++ \
library by Rick Blommers."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python310-QtAwesome-1.2.1-2.3.noarch.rpm"
RPM_HASH = "ef9cb7cd4fc9991d68205a59270e05ab36cf2639e2500f8241c70d60dc3155b89aee952d632e667553bc947fd48c4bec5b97bc19b55590cb337da7898c4527b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-qtawesome \
python310-QtAwesome \
python3dist-qtawesome"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-QtPy \
update-alternatives"

inherit rpm
