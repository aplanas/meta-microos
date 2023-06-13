SUMMARY = "Boost.Serialization runtime library"
DESCRIPTION = "This package contains the Boost.Serialization runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_serialization1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "b525cc567d79402a2c054afbbdfbf3a273e359e4f0172ee5ff0f91687dfa38d4a07b84577478850ad365d8c37bb1e621b63add3e646560f109ceff6647439d60"

RPROVIDES:${PN} += "libboost_serialization.so.1.82.0()(64bit) \
libboost_serialization1_82_0 \
libboost_serialization1_82_0(aarch-64) \
libboost_wserialization.so.1.82.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
