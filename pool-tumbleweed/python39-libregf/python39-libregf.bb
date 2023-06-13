SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python39-libregf-20230319-1.2.aarch64.rpm"
RPM_HASH = "5798c108808b32dfa634fc80cdf4568b8375433f9b5a2a1ab41e1e0e3f4eb0bc2cf2508bef80e706e89bc2a457d144993b59b42ac70ccbbf6cb230c281c4d834"

RPROVIDES:${PN} += "python39-libregf \
python39-libregf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libregf.so.1()(64bit) \
libregf.so.1(V_20230319)(64bit) \
python(abi)"

inherit rpm
