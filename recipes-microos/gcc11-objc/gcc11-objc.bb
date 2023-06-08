SUMMARY = "GNU Objective C Compiler"
DESCRIPTION = "This package contains the GNU Objective C compiler. Objective C is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-objc-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "48467179b1c5976ce5b03bb9ce3fd7f89f4600810f0ec9e8a49ee5e4b5906516e9a0eb21c7ab5d03140fefcb21e0588d4c3520b93862a914fe016466234f463d"

RPROVIDES:${PN} += "gcc11-objc gcc11-objc(aarch-64)"
RDEPENDS:${PN} += "gcc11 libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libobjc4 libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
