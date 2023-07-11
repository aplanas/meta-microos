SUMMARY = "Development files for Apfel, a PDF Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions. \
 \
This package provides the source files required to develop \
applications with apfel."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "apfel-devel-3.0.6-1.19.aarch64.rpm"
RPM_HASH = "b6137f2b2804df3b237e4c91f537c64c7f91090f1c7c1838511fa9916c03f39c1eb027637a211d450d8957347883c5f2e55528542dc4e886c29763079dc9cb44"

RPROVIDES:${PN} += "apfel-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
LHAPDF-devel \
libAPFEL.so.0 \
libAPFEL0 \
libLHAPDF-6.5.4.so \
libc.so.6 \
libgfortran.so.5"

inherit rpm
