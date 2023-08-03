SUMMARY = "Python bindings for Qt 6"
DESCRIPTION = "Python bindings for the Qt cross-platform application and UI framework."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-2.0-only & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "python3-shiboken6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "44a231022c963683f95f41e86dff644caab41873697d47a6214e7194154795af1756426b492aa399f4a8eee2c11d391fed4a077e77a4de7b83cb24966c05d75e"

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
