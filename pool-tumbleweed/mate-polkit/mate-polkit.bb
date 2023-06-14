SUMMARY = "MATE authentification agent for polkit"
DESCRIPTION = "mate-polkit provides a D-Bus session bus service that is used to bring \
up authentication dialogues used for obtaining privileges."
LICENSE = "LGPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "mate-polkit-1.26.1-1.3.aarch64.rpm"
RPM_HASH = "1556b78dc8c0d0c78475c50d1a0c950de0f053776791db85d1ed743ac91ef7c4d99f2ca98b813156c9fcfebde9e99eb35a868a352ce329bc9b92899ca7cdc961"

RPROVIDES:${PN} += "mate-polkit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libappindicator3.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpolkit-agent-1.so.0 \
libpolkit-gobject-1.so.0"

inherit rpm
