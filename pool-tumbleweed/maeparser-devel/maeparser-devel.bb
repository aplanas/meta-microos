SUMMARY = "Development files for maeparser"
DESCRIPTION = "This package contains the development files for maeparser."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "maeparser-devel-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "e2727044e77a2788df5d65c61ecc212e9706fe237039e8258bf4bff007cae0cf485c125887856401c12994de24ee05b7b340946a8aa228a0092bf0ebe674b92c"

RPROVIDES:${PN} += "maeparser-devel"

RDEPENDS:${PN} += "libboost-headers-devel \
libmaeparser1"

inherit rpm
