SUMMARY = "Library for MacOS data types"
DESCRIPTION = "libfmos is a library for MacOS data types."
LICENSE = "LGPL-3.0-or-later"

PV = "20220811"

RPM_NAME = "python310-libfmos-20220811-2.4.aarch64.rpm"
RPM_HASH = "d47f79b62b7066c2d1efa568d8f8b9917c5ebfe8abd13bad50f0f8489b362edfe2a6e5ea4ba7aab74d298ae706fb61447e1947fd9ffbba1f2853a177eb36b82d"

RPROVIDES:${PN} += "python3-libfmos \
python310-libfmos \
python310-libfmos(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfmos.so.1()(64bit) \
libfmos.so.1(V_20220811)(64bit) \
python(abi)"

inherit rpm
