SUMMARY = "IRC to other Chat Networks Gateway (Devel files)"
DESCRIPTION = "BitlBee is a gateway between instant messaging and an IRC client. \
With it, one's IRC client program can be reused and no extra IM program \
will need to run. \
 \
This package contains development files for external plugins."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "bitlbee-devel-3.6-4.4.aarch64.rpm"
RPM_HASH = "5b4bb41e31f938787ede62bd66b56a94e019706d218ba61e7d9711ea39a133f3a96f20bf1f0548ea1f2591c8afbb15dcb0c7eda4acdc76b57df23997ebb9226d"

RPROVIDES:${PN} += "bitlbee-devel \
bitlbee-devel(aarch-64) \
pkgconfig(bitlbee)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
bitlbee \
pkgconfig(glib-2.0)"

inherit rpm
