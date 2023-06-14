SUMMARY = "Development headers for Boost.Atomic"
DESCRIPTION = "Development support for Boost.Atomic, a library that provides atomic \
data types and operations on these data types, as well as memory \
ordering constraints required for coordinating multiple threads through \
atomic variables."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_atomic1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "5e82b205c32239e983a842f00509547f41ce3978e47c3ddc6154456d09f6525c7746661eecd764fcf98724dff7c7c96dff4b0810c5be830100182267f83763ca"

RPROVIDES:${PN} += "libboost-atomic-devel-impl \
libboost-atomic1-82-0-devel"

RDEPENDS:${PN} += "libboost-atomic1-82-0 \
libboost-headers1-82-0-devel \
libstdc++-devel"

inherit rpm
