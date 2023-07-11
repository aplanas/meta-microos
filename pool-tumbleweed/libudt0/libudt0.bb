SUMMARY = "UDP-based Data Transfer Protocol"
DESCRIPTION = "UDT is a reliable UDP-based application level data transport protocol \
for distributed data intensive applications over wide area high-speed \
networks. UDT uses UDP to transfer bulk data with its own reliability \
control and congestion control mechanisms. The new protocol can \
transfer data at a much higher speed than TCP does. UDT is also a \
highly configurable framework that can accommodate various congestion \
control algorithms. \
 \
This package provides the libraries used by applications to use UDT."
LICENSE = "BSD-3-Clause"

PV = "4.11"

RPM_NAME = "libudt0-4.11-1.23.aarch64.rpm"
RPM_HASH = "7bc6bd035e42dcde165789a4adc5f3961899c8a53f0df6cacd009201c65d6ea0da34453b75eaf8d1549d5cf67186081115a01fbae98916ff48239fcba5a20452"

RPROVIDES:${PN} += "libudt.so.0 \
libudt0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
