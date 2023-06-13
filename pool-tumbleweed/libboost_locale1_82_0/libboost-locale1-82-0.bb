SUMMARY = "Boost::Locale runtime library"
DESCRIPTION = "This package contains Boost::Locale runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_locale1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "3d1145db8c2ae9480a0c0648fec8898dac563047b77a12651dc2ceae1872d8873b84e34f51d35aba28dab92739851ff86a1b077626e5ff45bbc079390fc47614"

RPROVIDES:${PN} += "libboost_locale.so.1.82.0()(64bit) \
libboost_locale1_82_0 \
libboost_locale1_82_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
