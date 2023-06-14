SUMMARY = "GNOME Binary Editor"
DESCRIPTION = "GHex allows the user to load data from any file and to view and edit it \
in either hex or ASCII. It is a must for anyone playing games that use \
a non-ASCII format for saving."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "ghex-44.1-1.1.aarch64.rpm"
RPM_HASH = "815e5ed33304e8360e4eab871d174273382c7ad6dad5c955804c7829ef32b581ece0f79037a3340e056536a7c880338472a7eb9a37fc57731c6cda8f2def27fd"

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
