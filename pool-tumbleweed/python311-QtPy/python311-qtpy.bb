SUMMARY = "Abstraction layer on top of Qt bindings"
DESCRIPTION = "QtPy is a small abstraction layer that lets you \
write applications using a single API call to either PyQt or PySide. \
 \
It provides support for PyQt5, PyQt6, PySide6, PySide2 using the Qt5 \
layout (where the QtGui module has been split into QtGui and QtWidgets). \
Basically, you can write your code as if you were using PyQt or PySide \
directly, but import Qt modules from qtpy instead of PyQt5, PySide2, \
PyQt6 or PySide6."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-QtPy-2.3.0-2.3.noarch.rpm"
RPM_HASH = "80989b9c87f6d279fcb14550cce4fba9644fc5786499632c9c69b183b9c446f1deb18b3d09af81fb2070dccb7e32290cf15af54966a6692730059d7eb8863111"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QtPy \
python3.11dist-qtpy \
python311-QtPy \
python3dist-qtpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-packaging \
update-alternatives"

inherit rpm
