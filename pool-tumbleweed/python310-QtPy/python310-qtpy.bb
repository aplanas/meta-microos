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

RPM_NAME = "python310-QtPy-2.3.0-1.4.noarch.rpm"
RPM_HASH = "cf5ea312788f8761b3f7ee4e2e46f2d91a581c0f95db365538a3ba0e84ef0af11b5f1ec9066dca81b0bc083e06c6c6d77c8cd84ff29940536f982d5d5f10f7d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-QtPy \
python3.10dist-qtpy \
python310-QtPy \
python3dist-qtpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
update-alternatives"

inherit rpm
