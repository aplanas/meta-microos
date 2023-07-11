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

RPM_NAME = "python39-QtPy-2.3.0-2.3.noarch.rpm"
RPM_HASH = "2d62b7839c84f4b5ac76296347ae2f3e37e01b03b073cb17b8e9432f9d6b47a09c8c2aac8b4d2ad989870f406d8013ffe8b82ff2d2cb45014802b1beba2e27bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-qtpy \
python39-QtPy \
python3dist-qtpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-packaging \
update-alternatives"

inherit rpm
