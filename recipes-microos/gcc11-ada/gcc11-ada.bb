SUMMARY = "GNU Ada Compiler Based on GCC (GNAT)"
DESCRIPTION = "This package contains an Ada compiler and associated development \
tools based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-ada-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "c0e6ec4ca3203af34b449fcfa497bdc193866610552a788c72e71b94aa415facb24f1d1017af1f51e098ad50f54a7d337544c838c6bea2bce63074beaac07a78"

RPROVIDES:${PN} += "gcc11-ada gcc11-ada(aarch-64)"
RDEPENDS:${PN} += "gcc11 libada11 libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
