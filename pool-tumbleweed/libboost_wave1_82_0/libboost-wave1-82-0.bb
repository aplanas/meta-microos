SUMMARY = "Boost.Wave runtime library"
DESCRIPTION = "This package contains the Boost::Wave runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_wave1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "8b19f4bb27754945edb22753d4c36e2ba105d6927e9538f76681556719b42c0824a9d83c885d31cb9f6d66c7e9880ab3fadd268724d511f113414063b8c8b55a"

RPROVIDES:${PN} += "libboost_wave.so.1.82.0()(64bit) \
libboost_wave1_82_0 \
libboost_wave1_82_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
