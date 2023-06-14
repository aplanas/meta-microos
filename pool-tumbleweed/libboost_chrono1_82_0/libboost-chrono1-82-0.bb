SUMMARY = "The Boost::Chrono runtime library"
DESCRIPTION = "This package contains the Boost::Chrono runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_chrono1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "bdc34904eefe23b2017042b5f421e3e946537c69dd3ef4840ffb09fbc7b5334155ecc84561a0319e71b0aa56543368d1b699cf84270f76fa6276b1404b504a48"

RPROVIDES:${PN} += "libboost-chrono.so.1.82.0 \
libboost-chrono1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
