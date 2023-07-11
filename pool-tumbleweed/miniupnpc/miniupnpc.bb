SUMMARY = "Universal Plug'n'Play (UPnP) Client"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "miniupnpc-2.2.4-1.6.aarch64.rpm"
RPM_HASH = "3b2f65972cc2c091688d99c064eb896ba1fcbf48b00bdf7b12cf097d9ac9b5ef6ee6f1accd4af16ed1fdee989a0521fedef2751104fd3dcd33d282df3397f2b4"

RPROVIDES:${PN} += "miniupnpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libminiupnpc.so.17 \
libminiupnpc17"

inherit rpm
