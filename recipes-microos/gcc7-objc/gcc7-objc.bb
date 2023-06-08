SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-objc-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "bad852f3f9010540a373835c9381bf5bf5cba5114b32713fe3248a6eaedfe0d42006b55739b5e8a21b957fbdd43f1dd1d138bbb073befed03adc314ba555a0a4"

RPROVIDES:${PN} += "gcc7-objc gcc7-objc(aarch-64)"
RDEPENDS:${PN} += "gcc7 libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libobjc4 libz.so.1()(64bit)"

inherit rpm
