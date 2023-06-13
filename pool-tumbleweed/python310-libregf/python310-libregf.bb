SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "python310-libregf-20230319-1.2.aarch64.rpm"
RPM_HASH = "c2675b8f4c9c7e97248d52c0487d937b7cce6e84080aff3225c944f5799616bbb210269e6590717973afecf9ba41df100b2f86330b58f73b2620e86e26fbc424"

RPROVIDES:${PN} += "python3-libregf \
python310-libregf \
python310-libregf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libregf.so.1()(64bit) \
libregf.so.1(V_20230319)(64bit) \
python(abi)"

inherit rpm
