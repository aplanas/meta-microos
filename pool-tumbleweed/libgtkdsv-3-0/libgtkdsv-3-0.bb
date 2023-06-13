SUMMARY = "GtkD sourceview library"
DESCRIPTION = "This package contains the GtkD sourceview library."
LICENSE = "LGPL-3.0-or-later"

PV = "3.9.0"

RPM_NAME = "libgtkdsv-3-0-3.9.0-2.12.aarch64.rpm"
RPM_HASH = "886675fad3e853537e4845dc572e043e053d3d7c39560b3a8a92494482a3cf618c423a3b9b8c0d092ef72d38a6504952e33c4c605751d020ded629310f8601a8"

RPROVIDES:${PN} += "libgtkdsv-3-0 \
libgtkdsv-3-0(aarch-64) \
libgtkdsv-3.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libdruntime-ldc-shared.so.102()(64bit) \
libgcc_s.so.1()(64bit) \
libphobos2-ldc-shared.so.102()(64bit)"

inherit rpm
