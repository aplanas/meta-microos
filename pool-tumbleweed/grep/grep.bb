SUMMARY = "Print lines matching a pattern"
DESCRIPTION = "The grep command searches one or more input files for lines containing a \
match to a specified pattern.  By default, grep prints the matching lines."
LICENSE = "GPL-3.0-or-later"

PV = "3.11"

RPM_NAME = "grep-3.11-1.1.aarch64.rpm"
RPM_HASH = "016d13d34f511556c342a18384f4617b0f91851626a740fb00e84e5dfa554236f3f40a4b023dcbba5d4a271bc34f8c3f9e81de23ec9353000f2277c4afda68c2"

RPROVIDES:${PN} += "/bin/grep \
base:/usr/bin/grep \
grep \
grep(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcre2-8.so.0()(64bit)"

inherit rpm
