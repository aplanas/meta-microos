SUMMARY = "The GNU Fortran Compiler and Support Files"
DESCRIPTION = "This is the Fortran compiler of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-fortran-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "7df1fbfd874661c0b7c7b74f5151e2fa63990c41ee4b7f9edd78b9e26d473ca849bb7c079eb3dc1c103f33afdb2c9f2259176d7415afae1960d382f267d386a7"

RPROVIDES:${PN} += "gcc13-fortran gcc13-fortran(aarch-64)"
RDEPENDS:${PN} += "gcc13 libc.so.6(GLIBC_2.36)(64bit) libgfortran5 libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
