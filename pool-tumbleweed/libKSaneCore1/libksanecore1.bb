SUMMARY = "Qt interface for the SANE library for scanner hardware"
DESCRIPTION = "KSaneCore is a Qt-based interface for SANE library to control scanner hardware."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.3"

RPM_NAME = "libKSaneCore1-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "cf4d80d1aeb79d75c76d30fabc99d2c29a4dacf85d54933aa9dc1c64a8a767ad4ec85057b8e5b917acccdeff4d271829dec1cc9994071e410f8d83279f933a76"

RPROVIDES:${PN} += "ksanecore \
libKSaneCore.so.1 \
libKSaneCore1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libm.so.6 \
libsane.so.1 \
libstdc++.so.6"

inherit rpm
