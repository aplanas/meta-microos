SUMMARY = "Boost.Timer runtime library"
DESCRIPTION = "This package contains Boost.Timer runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_timer1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "d739c50171fc443ac76fdd95421b5a90f314b7486837e016bab32841edfa8a1ff905070ddc4daa1f77755044042f920b4d6c5cbaefd801d7e8df1f37442c50bc"

RPROVIDES:${PN} += "libboost_timer.so.1.82.0()(64bit) \
libboost_timer1_82_0 \
libboost_timer1_82_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
libboost_chrono.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
