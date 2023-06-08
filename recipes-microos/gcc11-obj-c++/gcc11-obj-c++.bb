SUMMARY = "GNU Objective C++ Compiler"
DESCRIPTION = "This package contains the GNU Objective C++ compiler. Objective C++ is an \
object oriented language, created by Next Inc. and used in their \
Nextstep OS. The source code is available in the gcc package."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-obj-c++-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "8dfef90f7188d086d1c79316e20018201aaaab82c074de35f1f54fd0812ea298acfa5b566dca414c4569e24b14dc6e1b5972b5ba5bee720f92b738f93030b41b"

RPROVIDES:${PN} += "gcc11-obj-c++ gcc11-obj-c++(aarch-64)"
RDEPENDS:${PN} += "gcc11-c++ gcc11-objc libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
