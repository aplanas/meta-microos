SUMMARY = "Compiling Verilog HDL simulator"
DESCRIPTION = "Verilator compiles synthesizable Verilog (not test-bench code), plus \
some PSL, SystemVerilog and Synthesis assertions into an optimized \
model which is in turn wrapped inside a C++/SystemC module for faster \
execution."
LICENSE = "Artistic-2.0 | LGPL-3.0-only"

PV = "4.228"

RPM_NAME = "verilator-4.228-1.4.aarch64.rpm"
RPM_HASH = "b77f98c79010256882f02986c4ed43abf221d42e60b14d7556c3cabca39c976affd58fd4940cc26868b38827d00e2cc70f60ed660babf21be0d990ef9223fdd1"

RPROVIDES:${PN} += "verilator"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
