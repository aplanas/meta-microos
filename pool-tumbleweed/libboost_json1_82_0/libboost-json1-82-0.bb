SUMMARY = "Boost.JSON runtime library"
DESCRIPTION = "This package contains Boost::JSON runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_json1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "b5700284da2971e0d470d5d45edffa8670fcfdba95f68cb7b7371818c3ca1a636bad5369c4c10e8809fc904c24de41002abd84761c2e2a60b13f8a06ae0bf10a"

RPROVIDES:${PN} += "libboost-json.so.1.82.0 \
libboost-json1-82-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
