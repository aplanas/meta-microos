SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-fortran-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "5572197face3330260a2eabed6ac7fbc96cfbac677e8d8aee81ef00f623d547e56a5e11832ddc0afb818242dadfb1a6b6ed437acd5ab0767733593a28c26bd99"

RPROVIDES:${PN} += "gcc7-fortran gcc7-fortran(aarch-64)"
RDEPENDS:${PN} += "gcc7 libc.so.6(GLIBC_2.34)(64bit) libgfortran4 libgmp.so.10()(64bit) libisl.so.23()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit)"

inherit rpm
