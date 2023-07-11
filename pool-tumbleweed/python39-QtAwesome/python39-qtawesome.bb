SUMMARY = "FontAwesome icons in PyQt and PySide applications"
DESCRIPTION = "QtAwesome enables iconic fonts such as Font Awesome and \
Elusive Icons in PyQt and PySide applications. \
 \
It is a port to Python - PyQt / PySide of the QtAwesome C++ \
library by Rick Blommers."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "python39-QtAwesome-1.2.1-2.3.noarch.rpm"
RPM_HASH = "d4d801603f3a8a97c54097fd72560903fe692e1b8d28e63975cc3c96e1dcb5f620a7fe457cfc093426e3bf97f1c6b331172d842382b71878d5b47762aa6cb983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qtawesome \
python39-QtAwesome \
python3dist-qtawesome"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-QtPy \
update-alternatives"

inherit rpm
