SUMMARY = "Static libraries for performance tools for C++"
DESCRIPTION = "The gperftools-devel-static package contains static libraries for developing \
applications that use the gperftools package."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "gperftools-devel-static-2.10-1.6.aarch64.rpm"
RPM_HASH = "74ac7072a0770d4b90aa30bbaa7f434c325b6b3a516fbfaf284bd05d29e308f07e5e329b902d17dc9244351bc27297e377221469b7069e08b279bd513ed04752"

RPROVIDES:${PN} += "gperftools-devel-static"

RDEPENDS:${PN} += "gperftools-devel"

inherit rpm
