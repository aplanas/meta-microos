SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-fortran-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "e3c2ce0e98c5c20e6546cf6a2a468e265e938c29930a8728d87d2a4ba8d5f45e62568ce126f5a26046a358f6c716f19a7bb8b619bb55c12bd9c187da70c9df37"

RPROVIDES:${PN} += "gcc11-fortran gcc11-fortran(aarch-64)"
RDEPENDS:${PN} += "gcc11 libc.so.6(GLIBC_2.34)(64bit) libgfortran5 libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
