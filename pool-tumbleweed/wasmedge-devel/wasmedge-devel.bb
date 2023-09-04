SUMMARY = "Development files for WasmEdge"
DESCRIPTION = "This package contains the header files and libraries needed for \
compiling programs using WasmEdge."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.13.3"

RPM_NAME = "wasmedge-devel-0.13.3-1.1.aarch64.rpm"
RPM_HASH = "02da4b256d8ef05f97abbea3470ccc076908b1aeb8ab229f61d929a9d742e591be93732f9e18c20608263589cb31347726fddebb753b9b35b96afc109b7d8eb0"

RPROVIDES:${PN} += "wasmedge-devel"

RDEPENDS:${PN} += "libwasmedge0"

inherit rpm
