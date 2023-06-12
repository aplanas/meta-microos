SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "python39-libmsiecf-20221024-3.5.aarch64.rpm"
RPM_HASH = "6b7bad20341f0b866ab5b50b00679adb720101fa31b1d40fb2e73e933fcf253d5a8620ee7abb234801d8dabc1e6b488597b43295d6852a61813415ed22eb90c0"

RPROVIDES:${PN} += "python39-libmsiecf \
python39-libmsiecf(aarch-64)"
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
