SUMMARY = "Universal Plug'n'Play (UPnP) Client Library"
DESCRIPTION = "The MiniUPnP project offers software which supports the UPnP Internet Gateway \
Device (IGD) specifications."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "libminiupnpc-devel-2.2.5-1.1.aarch64.rpm"
RPM_HASH = "cdf56c8d569892719c4c3e2435c9fe4d954318284a10341c7ff04bed2ace4490454d50da740bce544cd73ceb0721b82bdd3ba48eb931e1285b34bbe8913585cf"

RPROVIDES:${PN} += "libminiupnpc-devel \
pkgconfig-miniupnpc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libminiupnpc17"

inherit rpm
