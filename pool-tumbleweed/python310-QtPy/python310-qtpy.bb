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

RPM_NAME = "python310-QtPy-2.3.0-2.3.noarch.rpm"
RPM_HASH = "6eef778d70bdc1d139efc02612047389c70efee46deff42dd030abe5c5d25559ba51d7d9459579f9c00e5aad0226d471db57f7913368d207d8de12e91c678ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-qtpy \
python310-QtPy \
python3dist-qtpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
update-alternatives"

inherit rpm
