SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python311-libregf-20230319-1.2.aarch64.rpm"
RPM_HASH = "f2b19dab306724c68417cf6b8153f68a508c211285b3b4dc3e92e81163dd8eeabfd9ef8d3f529f21ca13ddd74c60e37e0891bae29bb14d816f18bc0f49acbaeb"

RPROVIDES:${PN} += "python311-libregf \
python311-libregf(aarch-64)"

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
