SUMMARY = "Dependency injection framework for Qt"
DESCRIPTION = "injeqt is an attempt to build a powerful and reliable dependency injection \
framework on Qt's reflection based on MOC (meta-object compiler)."
LICENSE = "LGPL-2.1+"

PV = "1.2.0"

RPM_NAME = "libinjeqt1-1.2.0-1.29.aarch64.rpm"
RPM_HASH = "dcf80aca5d6e7fb64312949cdfe0aeb40bc045af8e53fb90bcdfc899063ec120d883482c096db2d5b3d7b9cb18de9b81cb4071487e7a2f4a36f48d6515ab9d31"

RPROVIDES:${PN} += "libinjeqt.so.1 \
libinjeqt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
