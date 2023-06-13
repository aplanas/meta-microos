SUMMARY = "Library to access to optical disc (split) RAW image files"
DESCRIPTION = "libodraw is a library to access optical disc (split) RAW images such \
as BIN/ISO/CUE."
LICENSE = "LGPL-3.0-or-later"

PV = "20210503"

RPM_NAME = "libodraw1-20210503-3.6.aarch64.rpm"
RPM_HASH = "ad4fe1576ee60d5d55a335cc44182c9d157c39163ad6fcd463b8933693dfe87d8c00b533680c2a8f49efeb3e6ee9bc12e06ea8a3f6d3d17e073f1e5d13fd472f"

RPROVIDES:${PN} += "libodraw.so.1()(64bit) \
libodraw.so.1(V_20210503)(64bit) \
libodraw1 \
libodraw1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcdata.so.1()(64bit) \
libcdata.so.1(V_20230108)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libcpath.so.1()(64bit) \
libcpath.so.1(V_20220108)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
