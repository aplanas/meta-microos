SUMMARY = "Library for working with ISO 9660 filesystems"
DESCRIPTION = "A library for working with ISO 9660 filesystems, which are mainly used on CDs. \
This subpackage contains the C++ API library for cdio."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.0"

RPM_NAME = "libiso9660++0-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "305739cc8332b820d960ab0ba3151f5024a21c893b5f25d96c43338a5cfa3b754781c9b6e98d53603bfdeb55ca2f36944e4b5e84a303a1d18c456dc9c5fefa9f"

RPROVIDES:${PN} += "libiso9660++.so.0()(64bit) \
libiso9660++0 \
libiso9660++0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libiso9660.so.11()(64bit) \
libiso9660.so.11(ISO9660_11)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
