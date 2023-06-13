SUMMARY = "Boost.URL runtime library"
DESCRIPTION = "This package contains the Boost::URL runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_url1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "b888b8d8eece6b52f82ef2a64eb7fad165c4b987be7980b0bd8a10c301b926f3357d196405a160c38e539b88f5f5578c48561bdbf346c51fc821aefc24a4e1a2"

RPROVIDES:${PN} += "libboost_url.so.1.82.0()(64bit) \
libboost_url1_82_0 \
libboost_url1_82_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
