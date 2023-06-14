SUMMARY = "Development files for netgen"
DESCRIPTION = "Development files for NETGEN."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-devel-6.2.2301-1.4.aarch64.rpm"
RPM_HASH = "fa2b3af2cfff504ac8dad9eae43391261ca9ff873841f373fbe8e7fca114e1140a871a9e94450b4faaefd3481c12624531c3561461d70ff6031cbbde33ebbb2b"

RPROVIDES:${PN} += "cmake-Netgen \
netgen-devel"

RDEPENDS:${PN} += "netgen \
netgen-libs \
occt-devel"

inherit rpm
