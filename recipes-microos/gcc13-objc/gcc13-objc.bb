SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "gcc13-objc-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "93a9ef34094a582cfae70f4f43ff3dd7039a88a6d6671f60376f138f93fc4f221a816d30f8bd20d217fc19db8b6599dfdc895225d18a0de12faa00ae2950a64a"

RPROVIDES:${PN} += "gcc13-objc gcc13-objc(aarch-64)"
RDEPENDS:${PN} += "gcc13 libc.so.6(GLIBC_2.36)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libobjc4 libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
