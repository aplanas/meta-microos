SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-c++-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "fe417d6209bb7417fc1f0210c9a15ba3efdcc8d9096001adf15b7cc154c64cd940c0c01f781675303f209828139122696ad04d2e12ed960de3fa9485417e40a4"

RPROVIDES:${PN} += "gcc7-c++ gcc7-c++(aarch-64)"
RDEPENDS:${PN} += "gcc7 libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libstdc++6-devel-gcc7 libz.so.1()(64bit)"

inherit rpm
