SUMMARY = "A library for date and time data types"
DESCRIPTION = "A library for date and time data types. Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220112"

RPM_NAME = "libfdatetime1-20220112-4.2.aarch64.rpm"
RPM_HASH = "cbaf69ca45d21cb06e0ac58fe117c2ba9c2da7fb7100a5de1bd840024b31fe7c262d90302a23c90761d325dcf388873b260293b86474b59f0011205893d6f730"

RPROVIDES:${PN} += "libfdatetime.so.1()(64bit) \
libfdatetime.so.1(V_20220112)(64bit) \
libfdatetime1 \
libfdatetime1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit)"

inherit rpm
