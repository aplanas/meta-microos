SUMMARY = "Examples for verilator"
DESCRIPTION = "Verilator is a compiling Verilog HDL simulator. \
 \
This package contains examples of using verilator."
LICENSE = "Artistic-2.0 | LGPL-3.0-only"

PV = "4.228"

RPM_NAME = "verilator-examples-4.228-1.4.noarch.rpm"
RPM_HASH = "095464de2d27858e1482f2c38d74efd20854118ef7062b5ed606c7663a4730f5c93a0a632da0995f74d7b67bd9bc1bd78f2d5b9c3b43dcb1870690f0e1259568"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "verilator-examples"

RDEPENDS:${PN} += "verilator"

inherit rpm
