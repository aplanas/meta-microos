SUMMARY = "Qt wrapper for libolm"
DESCRIPTION = "This is a Qt wrapper for libolm."
LICENSE = "GPL-3.0-only"

PV = "3.0.1"

RPM_NAME = "libQtOlm3_0-3.0.1-1.11.aarch64.rpm"
RPM_HASH = "61f01cd5eea6752a64888bfb5efbbdca7a5f643823f5f38b9e014331ff92103e4c6e0e3a5f1cca0bd81c357aebd97c0f332a6a4add6983067d336bf0e32ee281"

RPROVIDES:${PN} += "libQtOlm.so.3.0 \
libQtOlm3-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libolm.so.3 \
libstdc++.so.6"

inherit rpm
