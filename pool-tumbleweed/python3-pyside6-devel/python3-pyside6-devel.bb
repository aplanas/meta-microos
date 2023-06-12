SUMMARY = "Development files for python3-pyside6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "python3-pyside6-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "81d262bfb04c9bcbf0197583e98dc9a81a2ebc76cbc210712a80fa4fc0e3aee252d87be7ad5ea8b4812c65fa05cf9d26b6bcdbcda68ef066684124d4adee395b"

RPROVIDES:${PN} += "cmake(PySide6) \
cmake(PySide6Qml) \
pkgconfig(pyside6) \
python3-pyside6-devel \
python3-pyside6-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(shiboken6) \
python3-pyside6"

inherit rpm
