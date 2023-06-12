SUMMARY = "Library for Handling Page Faults in User Mode"
DESCRIPTION = "This is a library for handling page faults in user mode. A page fault occurs \
when a program tries to access to a region of memory that is currently not \
available."
LICENSE = "GPL-2.0-or-later"

PV = "2.14"

RPM_NAME = "libsigsegv2-2.14-2.9.aarch64.rpm"
RPM_HASH = "b477dc467388bb398de8d625fafb09e91c52b9c7d0360c630dd06190b5c58ccd2bfdbcbf3f076e4fd4020f8419e11d1aea8b0c3746c36239467b0c9a5ecd868a"

RPROVIDES:${PN} += "libsigsegv.so.2()(64bit) \
libsigsegv2 \
libsigsegv2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
