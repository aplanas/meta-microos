SUMMARY = "Static development files for erfa"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that link statically to erfa."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "erfa-devel-static-2.0.0-1.11.aarch64.rpm"
RPM_HASH = "f5b3aeffb84e918c548d897d7609a1fcb4cc9e83b7460bbf433d917683a4cee48c93c5b7b870335f6bf170a916e375e18b71c9f0c19a91f3db5478f628167e27"

RPROVIDES:${PN} += "erfa-devel-static"

RDEPENDS:${PN} += "erfa-devel"

inherit rpm
