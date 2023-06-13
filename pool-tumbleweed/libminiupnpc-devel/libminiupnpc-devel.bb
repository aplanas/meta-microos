SUMMARY = "Universal Plug'n'Play (UPnP) Client Library"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "libminiupnpc-devel-2.2.4-1.4.aarch64.rpm"
RPM_HASH = "48c3c05e3378061a0e2b05fa2ac08af42c34bd76f7284dd4e8201a896c932148e10a865bc2bbe64e34cf11a332f29294d3e333c582c727fb378f53a63e0e9a0f"

RPROVIDES:${PN} += "libminiupnpc-devel \
libminiupnpc-devel(aarch-64) \
pkgconfig(miniupnpc)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libminiupnpc17"

inherit rpm
