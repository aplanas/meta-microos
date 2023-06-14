SUMMARY = "Compiling Verilog HDL simulator"
DESCRIPTION = "Verilator compiles synthesizable Verilog (not test-bench code), plus \
some PSL, SystemVerilog and Synthesis assertions into an optimized \
model which is in turn wrapped inside a C++/SystemC module for faster \
execution."
LICENSE = "Artistic-2.0 | LGPL-3.0-only"

PV = "4.228"

RPM_NAME = "verilator-4.228-1.3.aarch64.rpm"
RPM_HASH = "a90369833635517f9e2159e1add6b1105576cbfff8e978233e3124598e58864846a1eca11d5b383ddcad533032867174cdb6d2a24eebd24208347d698bc4d7df"

RPROVIDES:${PN} += "verilator"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
