SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "python3-shiboken6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "7676991d64267b690d554ac4f89a7ff7c7c3ccd22763af7162fd5b62f97c6a80615135703b7f4e01cd7d12c0eab20f3d70b9c7202514a9c173b9267dc97f671c"

RPROVIDES:${PN} += "libshiboken6.abi3.so.6.5 \
python3-shiboken6 \
python3.11dist-shiboken6 \
python3dist-shiboken6"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
libQt6Core.so.6 \
libc.so.6 \
libclang.so.13 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libxml2.so.2 \
libxslt.so.1 \
python-abi"

inherit rpm
