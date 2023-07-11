SUMMARY = "Library for prompting for PGP keys"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "LGPL-2.1-or-later"

PV = "3.12.2"

RPM_NAME = "libcryptui0-3.12.2-10.4.aarch64.rpm"
RPM_HASH = "8c005930c4992badd82a3f530ea3071524858bae50b841e81bcb25a54c0f038a3c745e4a08e27afb2259dd0ed8a082721044ed57dbd586ec864b69986a5f40ba"

RPROVIDES:${PN} += "libcryptui \
libcryptui.so.0 \
libcryptui0"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnome-keyring \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptui-data \
libdbus-glib-1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
