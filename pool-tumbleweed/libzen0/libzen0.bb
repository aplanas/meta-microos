SUMMARY = "The ZenLib C++ utility library"
DESCRIPTION = "ZenLib is a C++ utility library. It includes classes for handling \
strings, configuration, bit streams, threading, translation \
and cross-platform operating system functions."
LICENSE = "Zlib"

PV = "0.4.41"

RPM_NAME = "libzen0-0.4.41-1.1.aarch64.rpm"
RPM_HASH = "758016551be0e24520216d564e379fd7892a48748348ccc70060e065210ddd5d5d9818da537544d066e989975396dda9974fa8911bd3130eb63e457eac2bb897"

RPROVIDES:${PN} += "libzen.so.0()(64bit) \
libzen0 \
libzen0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
