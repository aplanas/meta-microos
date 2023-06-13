SUMMARY = "Simple program to make windows transparent"
DESCRIPTION = "transset manipulates the _NET_WM_WINDOW_OPACITY property to make \
windows transparent."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "transset-1.0.3-1.2.aarch64.rpm"
RPM_HASH = "052403851352d55d2ac3de254c744beca8b22e867e1484b6660313492fa18bd84b86c9c0d0f685e4437536d58f8ca9143ee4d2f4d0935f15682d45d07002b8e4"

RPROVIDES:${PN} += "transset \
transset(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
