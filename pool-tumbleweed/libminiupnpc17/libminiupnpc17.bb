SUMMARY = "Universal Plug'n'Play (UPnP) Client Library"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "libminiupnpc17-2.2.4-1.6.aarch64.rpm"
RPM_HASH = "052eafa73eb8369323814dd416d2227c0673d2cf27b77b925a58265c412a6b28502e1b7c61f0d45431c7089d7fec7e38b6b84b5396eb7ed24c73a88ef903fb64"

RPROVIDES:${PN} += "libminiupnpc.so.17 \
libminiupnpc17"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
