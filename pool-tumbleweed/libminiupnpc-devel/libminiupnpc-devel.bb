SUMMARY = "Universal Plug'n'Play (UPnP) Client Library"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "libminiupnpc-devel-2.2.4-1.6.aarch64.rpm"
RPM_HASH = "2cb3fcce2a130ebc41cfc3b6c8f51ea58d37f79764e5c55a7d1e3a099fa1a7ee3a88f599352febde8099d1acff2537c91287845d611fa6e2706b8b3214671bba"

RPROVIDES:${PN} += "libminiupnpc-devel \
pkgconfig-miniupnpc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libminiupnpc17"

inherit rpm
