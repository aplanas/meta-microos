SUMMARY = "GNOME Binary Editor -- Library"
DESCRIPTION = "GHex allows the user to load data from any file and to view and edit it \
in either hex or ASCII. It is a must for anyone playing games that use \
a non-ASCII format for saving."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "libgtkhex-4-1-44.1-1.1.aarch64.rpm"
RPM_HASH = "3f54c9b6cdf0851c03a20e91438019d662e6504e310c36be650b51313ea632d465edaa8e92b67e972aa4ffa092b3f6cbe60dc236437dbd346f172027fb17542f"

RPROVIDES:${PN} += "libgtkhex-4-1 \
libgtkhex-4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0"

inherit rpm
