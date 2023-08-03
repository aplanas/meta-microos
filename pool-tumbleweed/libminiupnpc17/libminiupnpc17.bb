SUMMARY = "Universal Plug'n'Play (UPnP) Client Library"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "libminiupnpc17-2.2.5-1.1.aarch64.rpm"
RPM_HASH = "8fc31dc2f5bfdfa650492571df80ca6c36f9a33bbedf4835204b542809716f64175e2f315838e8fcd9ba082dee55f4812da1a7579a367a12558e95b8e19e9845"

RPROVIDES:${PN} += "libminiupnpc.so.17 \
libminiupnpc17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
