SUMMARY = "Development headers for Boost.Fiber library"
DESCRIPTION = "This package contains development header files and libraries for \
Boost.Fiber library. Boost.Fiber is a cooperative multi-tasking \
userland threading library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_fiber1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "fb863977382bb59685329379d7e98d8c486d890236f2bc8e121ae39d5bb6d2e612ddc19a9b817ea0862cc2147049e900fc4852ed7c9d356dd4ddd4cb9e75804a"

RPROVIDES:${PN} += "libboost-fiber-devel-impl \
libboost-fiber1-82-0-devel"

RDEPENDS:${PN} += "libboost-context1-82-0-devel \
libboost-fiber1-82-0 \
libboost-filesystem1-82-0-devel \
libboost-headers1-82-0-devel \
libstdc++-devel"

inherit rpm
