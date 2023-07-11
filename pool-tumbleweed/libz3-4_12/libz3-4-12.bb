SUMMARY = "Library for the Z3 SMT theorem prover"
DESCRIPTION = "Z3 is a Satisfiability Modulo Theories (SMT) solver and integrates \
several decision procedures. \
 \
This subpackage contains the Z3 runtime library needed for Z3 and \
other projects."
LICENSE = "MIT"

PV = "4.12.2"

RPM_NAME = "libz3-4_12-4.12.2-1.1.aarch64.rpm"
RPM_HASH = "f0d83df3e263fe9d39664100b90ed9a4bcf4b4fd322bc3de0a27992ddfeed8c171a341160b275e7413b4f14863a3ff457f692cfe086bdad77babc8e6b8ed4f69"

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
