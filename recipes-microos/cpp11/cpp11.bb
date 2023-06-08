SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "cpp11-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "8e815c3cc1717a3f455e61b58a421fd513cc2127d3490401e5ec2e38afa7a09d33794da7fada3f3f94a51cd8ceacbf53c7912519fe31bceda61bd31a787780eb"

RPROVIDES:${PN} += "cpp11 cpp11(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
