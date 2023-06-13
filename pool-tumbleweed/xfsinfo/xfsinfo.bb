SUMMARY = "X font server information utility"
DESCRIPTION = "xfsinfo is a utility for displaying information about an X font \
server. It is used to examine the capabilities of a server, the \
predefined values for various parameters used in communicating between \
clients and the server, and the font catalogues and alternate servers \
that are available."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "xfsinfo-1.0.7-1.2.aarch64.rpm"
RPM_HASH = "e0bf77c5c280fd5bca985de2798f8bb35327ef5bead26a3a1eee2a82f1a55f993b3adbb68155ded953d94a07aa50f38ab990411abbe493812ba7184c1904a41b"

RPROVIDES:${PN} += "xfsinfo \
xfsinfo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFS.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
