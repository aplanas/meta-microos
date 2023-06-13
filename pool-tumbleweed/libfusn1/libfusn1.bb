SUMMARY = "Library for Update Sequence Number (USN) Journal data types"
DESCRIPTION = "libfusn is a library for Update Sequence Number (USN) Journal data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220119"

RPM_NAME = "libfusn1-20220119-4.2.aarch64.rpm"
RPM_HASH = "90d9d20938952ef5ae1d9554877931107cbaa0c8a5f8460c07d8e371d689546620d0d2c64cfd4593cd15285df8d0cbfb3eab4fef8cbdd8119d612da1d925d40f"

RPROVIDES:${PN} += "libfusn.so.1()(64bit) \
libfusn.so.1(V_20220119)(64bit) \
libfusn1 \
libfusn1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
