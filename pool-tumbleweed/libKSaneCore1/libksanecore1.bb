SUMMARY = "Qt interface for the SANE library for scanner hardware"
DESCRIPTION = "KSaneCore is a Qt-based interface for SANE library to control scanner hardware."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "libKSaneCore1-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "1b8ecf490f6cc9e0f3eb8aa0109642edc929722d1ef286fd6665f1082df2e7b628c07a0836aafbb2ee7a86f0c19a3e036131404069c5dcb05f7477094e633a1a"

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
