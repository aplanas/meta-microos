SUMMARY = "Library for the GNU Objective C Compiler"
DESCRIPTION = "The library for the GNU Objective C compiler."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libobjc4-gcc7-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "c1739fbe05b60a53f815c928ffe629be85dd4a433b065988b5a0360e91d7a1aba7827c160cb91c80aa850f9e0961fb324847b0c4bffc15d5bd18a2c6decce9e3"

RPROVIDES:${PN} += "libobjc.so.4()(64bit) \
libobjc4 \
libobjc4-gcc7 \
libobjc4-gcc7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit)"

inherit rpm
