SUMMARY = "ATK/D-Bus bridging library"
DESCRIPTION = "AT-SPI is a general interface for applications to make use of the \
accessibility toolkit. This version is based on dbus. \
 \
The package contains a ATK/D-Bus bridge library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "libatk-bridge-2_0-0-2.48.3-2.1.aarch64.rpm"
RPM_HASH = "4f966543b01e68f758b3f904ed6adefe781acbddebd9bb797afff6f93b23af8beda4901b568a37e460d4b0559b18160ba210d0976f7cb49755291b920357017c"

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
