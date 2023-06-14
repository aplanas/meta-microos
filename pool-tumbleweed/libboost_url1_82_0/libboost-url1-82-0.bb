SUMMARY = "Boost.URL runtime library"
DESCRIPTION = "This package contains the Boost::URL runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_url1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "b888b8d8eece6b52f82ef2a64eb7fad165c4b987be7980b0bd8a10c301b926f3357d196405a160c38e539b88f5f5578c48561bdbf346c51fc821aefc24a4e1a2"

RPROVIDES:${PN} += "libboost-url.so.1.82.0 \
libboost-url1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
