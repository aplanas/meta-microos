SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-obj-c++-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "0e41592ecad8cfa72467fc4d01b2a71b9e9b475217df9858ed7fe1675902ace3e1f3035d70a7b3bb3740e20ec090a92c0183864fe48f90eb4a4f322ae18b9d19"

RPROVIDES:${PN} += "gcc7-obj-c++ gcc7-obj-c++(aarch-64)"
RDEPENDS:${PN} += "gcc7-c++ gcc7-objc libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit)"

inherit rpm
