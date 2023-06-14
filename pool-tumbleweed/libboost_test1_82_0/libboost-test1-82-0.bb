SUMMARY = "Boost.Test runtime library"
DESCRIPTION = "This package contains the BoosttTest runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_test1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "373cb40cfa698367209da59f65c7326d5234849a12460bd2e8b10f853cd1a25cbbf95fd034387270e166e41c2d7fce8e4e64f1078ec4e8f9000bb78adc22817c"

RPROVIDES:${PN} += "libboost-prg-exec-monitor.so.1.82.0 \
libboost-test-exec-monitor.so.1.82.0 \
libboost-test1-82-0 \
libboost-unit-test-framework.so.1.82.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-82-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
