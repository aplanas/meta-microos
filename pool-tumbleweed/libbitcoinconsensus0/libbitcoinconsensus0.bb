SUMMARY = "Bitcoin consensus library"
DESCRIPTION = "The purpose of this library is to make the verification functionality that \
is critical to Bitcoin’s consensus available to other applications, \
e.g. to language bindings such as python-bitcoinlib or alternative node \
implementations."
LICENSE = "MIT"

PV = "25.0"

RPM_NAME = "libbitcoinconsensus0-25.0-1.1.aarch64.rpm"
RPM_HASH = "0865f17809e21625207fd9bbf221a3c8502c95048ac40be5a98bb2168e7a6fcfadc316e812c84ec81ac9f663a674b6d1e15066c1f173d8093d9e2a2865a30a2c"

RPROVIDES:${PN} += "libbitcoinconsensus.so.0 \
libbitcoinconsensus0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
