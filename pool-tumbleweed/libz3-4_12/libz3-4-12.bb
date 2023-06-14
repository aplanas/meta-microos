SUMMARY = "Library for the Z3 SMT theorem prover"
DESCRIPTION = "Z3 is a Satisfiability Modulo Theories (SMT) solver and integrates \
several decision procedures. \
 \
This subpackage contains the Z3 runtime library needed for Z3 and \
other projects."
LICENSE = "MIT"

PV = "4.12.1"

RPM_NAME = "libz3-4_12-4.12.1-1.3.aarch64.rpm"
RPM_HASH = "050003facd32588b36bdf5d5009fe1cfee04644996122f6cd25315c27ee17475feb5a692dcda032377ad16ce4852460037611b3875dfe9d257c57633e5de855f"

RPROVIDES:${PN} += "libz3-4-12 \
libz3.so.4.12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
