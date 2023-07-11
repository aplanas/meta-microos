SUMMARY = "Daemon for Budgie Extras"
DESCRIPTION = "This on logon process manages keyboard shortcuts delivered via .bde files for various extras-plugins."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-extras-daemon-1.6.0-1.2.aarch64.rpm"
RPM_HASH = "878d1146daa400cfc4aeac9c8b056d616b93b2b9d0aa9fedf718344bd8368069fc186a5270d07bd1b1a125d8736647704dd631ff22b5ba8d2a83d2042b7bfb14"

RPROVIDES:${PN} += "budgie-extras-daemon"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libkeybinder-3.0.so.0"

inherit rpm
