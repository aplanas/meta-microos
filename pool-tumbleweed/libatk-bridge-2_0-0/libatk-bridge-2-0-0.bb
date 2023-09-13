SUMMARY = "ATK/D-Bus bridging library"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
The package contains a ATK/D-Bus bridge library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.4"

RPM_NAME = "libatk-bridge-2_0-0-2.48.4-1.1.aarch64.rpm"
RPM_HASH = "b7efd388f827750da9a5f959d383e37f6f1fe163a9020caa74a8fff0e0d352f18db968d1645ba84cdfc2f8b6a3f8a7efc53b3828c29147e408f18d0102447172"

RPROVIDES:${PN} += "libatk-bridge-2-0-0 \
libatk-bridge-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libatspi.so.0 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
