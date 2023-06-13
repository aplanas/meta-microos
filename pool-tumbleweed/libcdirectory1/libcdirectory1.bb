SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20220105"

RPM_NAME = "libcdirectory1-20220105-2.4.aarch64.rpm"
RPM_HASH = "83bc20d6ec654fed83dd7ffe0dc5dc070b638530c362d87122c4b845879f7751c52c3e5fa1088da4c946b214fe568b205c4e0d85bbe7668a949b64005ca93506"

RPROVIDES:${PN} += "libcdirectory.so.1()(64bit) \
libcdirectory.so.1(V_20220105)(64bit) \
libcdirectory1 \
libcdirectory1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
