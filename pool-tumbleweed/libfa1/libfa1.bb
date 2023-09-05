SUMMARY = "Finite automaton library for Augeas"
DESCRIPTION = "Component library for the Augeas configuration parser."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libfa1-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "7ad52986aa7bf79fa020c72c3b1afd4d44b47951d5b9afdff6ddc9232dc9dd75289f8370466f7ffe659cbf00ada68d8361489c692a8507b039e5a6643d826e5f"

RPROVIDES:${PN} += "libfa.so.1 \
libfa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
