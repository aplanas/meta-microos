SUMMARY = "GlusterFS API library"
DESCRIPTION = "GlusterFS is a clustered file-system capable of scaling to several \
petabytes."
LICENSE = "GPL-2.0-only | LGPL-3.0-or-later"

PV = "11.0"

RPM_NAME = "libgfapi0-11.0-2.1.aarch64.rpm"
RPM_HASH = "00553271421d7a7d2555a4c01096fc15b01494f99304e744fe77402eef733e7e4175387c1396acd30d0def1ab33a36fb521306981784fd5c41c068e582cdd2bc"

RPROVIDES:${PN} += "libgfapi.so.0()(64bit) \
libgfapi.so.0(GFAPI_11.0)(64bit) \
libgfapi.so.0(GFAPI_3.10.0)(64bit) \
libgfapi.so.0(GFAPI_3.10.7)(64bit) \
libgfapi.so.0(GFAPI_3.11.0)(64bit) \
libgfapi.so.0(GFAPI_3.13.0)(64bit) \
libgfapi.so.0(GFAPI_3.4.0)(64bit) \
libgfapi.so.0(GFAPI_3.4.2)(64bit) \
libgfapi.so.0(GFAPI_3.5.0)(64bit) \
libgfapi.so.0(GFAPI_3.5.1)(64bit) \
libgfapi.so.0(GFAPI_3.6.0)(64bit) \
libgfapi.so.0(GFAPI_3.7.0)(64bit) \
libgfapi.so.0(GFAPI_3.7.15)(64bit) \
libgfapi.so.0(GFAPI_3.7.16)(64bit) \
libgfapi.so.0(GFAPI_3.7.17)(64bit) \
libgfapi.so.0(GFAPI_3.7.4)(64bit) \
libgfapi.so.0(GFAPI_4.0.0)(64bit) \
libgfapi.so.0(GFAPI_4.1.6)(64bit) \
libgfapi.so.0(GFAPI_6.0)(64bit) \
libgfapi.so.0(GFAPI_6.6)(64bit) \
libgfapi.so.0(GFAPI_7.0)(64bit) \
libgfapi.so.0(GFAPI_PRIVATE_3.12.0)(64bit) \
libgfapi.so.0(GFAPI_PRIVATE_3.4.0)(64bit) \
libgfapi.so.0(GFAPI_PRIVATE_3.7.0)(64bit) \
libgfapi.so.0(GFAPI_PRIVATE_6.0)(64bit) \
libgfapi.so.0(GFAPI_PRIVATE_6.1)(64bit) \
libgfapi0 \
libgfapi0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgfrpc.so.0()(64bit) \
libgfxdr.so.0()(64bit) \
libglusterfs.so.0()(64bit) \
libtirpc.so.3()(64bit) \
libtirpc.so.3(TIRPC_0.3.3)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit)"

inherit rpm
