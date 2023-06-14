SUMMARY = "Development package for kproperty"
DESCRIPTION = "Development package for the property editing Framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kproperty-devel-3.2.0-2.21.aarch64.rpm"
RPM_HASH = "f80c2382cfac9b56d7d7d66965d0f9303714af3553315f4e01ea2d9caeb94079027f7c610ab05b2eee06eea3ee6e5f71e01e2552163be6c940c7433c7cc53784"

RPROVIDES:${PN} += "cmake-KPropertyCore \
cmake-KPropertyWidgets \
kproperty-devel"

RDEPENDS:${PN} += "libKPropertyCore3-4 \
libKPropertyWidgets3-4"

inherit rpm
