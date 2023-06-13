SUMMARY = "Universal Plug'n'Play (UPnP) Client"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "miniupnpc-2.2.4-1.4.aarch64.rpm"
RPM_HASH = "ed85395694e7f88e93ecb607e7625fcd705f212a483e8435e9e80b2ff380137cdd1d594f18b193f9f81bb49cc17affb7cc5729decf52972fef623062951260aa"

RPROVIDES:${PN} += "miniupnpc \
miniupnpc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
libminiupnpc.so.17()(64bit) \
libminiupnpc17"

inherit rpm
