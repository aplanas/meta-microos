SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python310-libmsiecf-20221024-3.5.aarch64.rpm"
RPM_HASH = "a8623a55231a40774652e860e4a6b83f10650c77bea3dbda1ce3d58b50fa697b8c1a59b053282398ee313d8c7397a1597e429ca8d22460c61c72f6eb2f164e21"

RPROVIDES:${PN} += "python3-libmsiecf \
python310-libmsiecf \
python310-libmsiecf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libmsiecf.so.1()(64bit) \
libmsiecf.so.1(V_20221024)(64bit) \
python(abi)"

inherit rpm
