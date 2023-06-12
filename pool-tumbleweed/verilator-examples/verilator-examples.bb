SUMMARY = "Examples for verilator"
DESCRIPTION = "Verilator is a compiling Verilog HDL simulator. \
 \
This package contains examples of using verilator."
LICENSE = "Artistic-2.0 | LGPL-3.0-only"

PV = "4.228"

RPM_NAME = "verilator-examples-4.228-1.3.noarch.rpm"
RPM_HASH = "3fe410d01a1cbe240358727b46e1e6169f25bdd1f3b3f58df46ecc7563a4e90d288d1dfb8edad594bb1e5395e21318bc6a27b3ab3d839b7b996475425022c8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "verilator-examples"
RDEPENDS:${PN} += "verilator"

inherit rpm
