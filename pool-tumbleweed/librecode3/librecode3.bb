SUMMARY = "Recode shared library"
DESCRIPTION = "Recode converts files between various character sets. \
 \
This package contains librecode shared library for embedding in \
other applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.7.14"

RPM_NAME = "librecode3-3.7.14-1.1.aarch64.rpm"
RPM_HASH = "40ab19e8a7c18e049bc547d3a8398ea2dc140eae40fcd851aadf8bb639567abb833e67326d6e93fb9870546fc150a2b8f991f19fe1118a36b2c936db3e46ccce"

RPROVIDES:${PN} += "librecode.so.3()(64bit) \
librecode3 \
librecode3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
