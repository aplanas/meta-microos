SUMMARY = "Finite automaton library for Augeas"
DESCRIPTION = "Component library for the Augeas configuration parser."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "libfa1-1.13.0-2.1.aarch64.rpm"
RPM_HASH = "ed23d391d0da8b527a59e1ef3faa4e5363f7a40ebc40cff537927c5be7c3cc89bb8787e67364ccb221f4aa564dbabf79f8554c6dc66aa1045f481320da8dc745"

RPROVIDES:${PN} += "libfa.so.1()(64bit) \
libfa.so.1(FA_1.0.0)(64bit) \
libfa.so.1(FA_1.2.0)(64bit) \
libfa.so.1(FA_1.4.0)(64bit) \
libfa.so.1(FA_1.5.0)(64bit) \
libfa1 \
libfa1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
