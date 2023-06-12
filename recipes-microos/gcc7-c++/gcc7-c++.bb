SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-c++-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "b0a990bc75f2ba638a0eb603e51211fa56ff478f8f7f53422dca2029f15ddf6fd3e94b565281b66f80d8e8734732f7dc25b79df854db0145b071a32648a7895f"

RPROVIDES:${PN} += "gcc7-c++ gcc7-c++(aarch-64)"
RDEPENDS:${PN} += "gcc7 libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libstdc++6-devel-gcc7 libz.so.1()(64bit)"

inherit rpm
