SUMMARY = "Infiniband Unicified Communication Services"
DESCRIPTION = "This framework provides infrastructure for component based \
programming, memory management, and system utilities."
LICENSE = "BSD-3-Clause"

PV = "1.14.1"

RPM_NAME = "libucs0-1.14.1-1.1.aarch64.rpm"
RPM_HASH = "cb2da8fd0770636d43d15408b3cac347d8ed3fb4b0336e4bf158faa2cd15d2b74761637f65695e14fa5dc76b411101c601dc870a62f91598879b02aa99237c64"

RPROVIDES:${PN} += "libucs-signal.so.0 \
libucs.so.0 \
libucs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libnuma.so.1 \
libucm.so.0"

inherit rpm
