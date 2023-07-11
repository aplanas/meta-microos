SUMMARY = "Verilator library header files"
DESCRIPTION = "Development files for Verilator, a compiling Verilog HDL simulator. \
It includes header files and a pkgconfig file."
LICENSE = "Artistic-2.0 | LGPL-3.0-only"

PV = "4.228"

RPM_NAME = "verilator-devel-4.228-1.4.noarch.rpm"
RPM_HASH = "2c5967d3e8ae14b29622331cda109b4e8269613a3e1eda4e398084818b9f7230fbdf29d7ca6517d2bcb4372b911fcd18eb982928b468bf4b71dd6c4e7191d4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-verilator \
verilator-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
verilator"

inherit rpm
