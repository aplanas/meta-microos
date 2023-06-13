SUMMARY = "Query configuration information of DRI drivers"
DESCRIPTION = "Driinfo can be used to query configuration information of direct rendering \
drivers (DRI)."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "xdriinfo-1.0.7-1.2.aarch64.rpm"
RPM_HASH = "834fe353ea2d295da0524d40c75be6ada5ec31f7f114cc18fc4ff0b0878d4329dd24680ecb040f4fc5cea402f817e84c85b26d61faab39e0b4355ca9c2ed2346"

RPROVIDES:${PN} += "xdriinfo \
xdriinfo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
