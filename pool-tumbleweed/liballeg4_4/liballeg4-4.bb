SUMMARY = "A game programming library"
DESCRIPTION = "Allegro is a cross-platform library intended for use in computer games \
and other types of multimedia programming."
LICENSE = "SUSE-Permissive"

PV = "4.4.3.1"

RPM_NAME = "liballeg4_4-4.4.3.1-1.16.aarch64.rpm"
RPM_HASH = "89ccc3d23d84c97533f257c9b39a12cc105f7d6ba0e33b391324fb3fea1817e20006b8ef1c6e4e5390d63c044f52c53fb4c6f3030cbb3cc9a304c1fc3d5ec39e"

RPROVIDES:${PN} += "liballeg.so.4.4 \
liballeg4-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXext.so.6 \
libXpm.so.4 \
libXxf86vm.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
