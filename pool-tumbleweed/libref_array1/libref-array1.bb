SUMMARY = "A refcounted array for C"
DESCRIPTION = "A dynamically-growing, reference-counted array"
LICENSE = "GPL-3.0-or-later"

PV = "0.1.5"

RPM_NAME = "libref_array1-0.1.5-27.18.aarch64.rpm"
RPM_HASH = "78953a0d8fd894da63d9e4c5760de9f13dad8072453c37081a9dc29a04c1653a8253f79c62e921969ae0b556914739edffe2230d16df7c4dbd0013e477ad2446"

RPROVIDES:${PN} += "libref_array.so.1()(64bit) \
libref_array1 \
libref_array1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
