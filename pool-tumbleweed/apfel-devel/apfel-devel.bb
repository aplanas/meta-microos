SUMMARY = "Development files for Apfel, a PDF Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions. \
 \
This package provides the source files required to develop \
applications with apfel."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.6"

RPM_NAME = "apfel-devel-3.0.6-1.17.aarch64.rpm"
RPM_HASH = "c68d050f04ad7a07583e34dcb55d30aa4158de4020c891a925feeb48cc463a4129ae442ac08b1c932ac2a5c13ef714256a229d5682515fdc6f63550c2eb673e2"

RPROVIDES:${PN} += "apfel-devel \
apfel-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
LHAPDF-devel \
libAPFEL.so.0()(64bit) \
libAPFEL0 \
libLHAPDF-6.5.4.so()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit)"

inherit rpm
