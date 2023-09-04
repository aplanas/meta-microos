SUMMARY = "GNOME Binary Editor"
DESCRIPTION = "GHex allows the user to load data from any file and to view and edit it \
in either hex or ASCII. It is a must for anyone playing games that use \
a non-ASCII format for saving."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "ghex-44.2-1.1.aarch64.rpm"
RPM_HASH = "9c214d659f1417d48eb9c0b3dc0cb30d10e070aaadb911c2b783a4ec788953019ceeee72168bad4a6970996da2a5bfe9fccf7ec73997ba8a454e29bdfa0125a5"

RPROVIDES:${PN} += "ghex \
libhex-buffer-direct.so \
libhex-buffer-mmap.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtkhex-4.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
