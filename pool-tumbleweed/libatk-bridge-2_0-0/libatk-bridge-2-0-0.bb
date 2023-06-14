SUMMARY = "ATK/D-Bus bridging library"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
The package contains a ATK/D-Bus bridge library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "libatk-bridge-2_0-0-2.48.3-1.1.aarch64.rpm"
RPM_HASH = "f57c0c8dd24ca84f09e9d0facc11cf749bdf31b2a64d6916a5d60591008c7a32c89e938ceca3f941af3ec2e0d72f184813e40013cf91eb557acfadac12237ac8"

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
