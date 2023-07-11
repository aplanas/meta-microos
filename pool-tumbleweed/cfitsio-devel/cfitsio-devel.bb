SUMMARY = "Headers required when building programs against cfitsio library"
DESCRIPTION = "This package contains headers required when building programs against cfitsio \
library."
LICENSE = "ISC"

PV = "4.2.0"

RPM_NAME = "cfitsio-devel-4.2.0-2.4.aarch64.rpm"
RPM_HASH = "64047f8d8fac67ef4a6421f8183e7a893f817f646cce0d9100fe0acb36a38a8b0d0de57703a87ff7bde4ca8e04809a8dd36ca5c4dc68b9cb862afed6276e02ee"

RPROVIDES:${PN} += "cfitsio-devel \
pkgconfig-cfitsio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcfitsio10"

inherit rpm
