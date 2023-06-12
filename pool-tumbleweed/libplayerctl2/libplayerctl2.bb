SUMMARY = "A library for controlling media players over D-Bus"
DESCRIPTION = "A library for controlling media players that implement the MPRIS D-Bus \
Interface Specification."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "libplayerctl2-2.4.1-1.8.aarch64.rpm"
RPM_HASH = "f1c616602b30a93040a8a7546ac5023a7773c47fcb9b34ca1cc749965c04373fc2e571b690a7be288481e9eb494e14ad4f556f30a2eaaf0643a5eb510c5d3530"

RPROVIDES:${PN} += "libplayerctl.so.2()(64bit) \
libplayerctl2 \
libplayerctl2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
