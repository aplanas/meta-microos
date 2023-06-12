SUMMARY = "GClient library for fcitx5"
DESCRIPTION = "This package provides GClient library for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "libFcitx5GClient2-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "54d996a8da7f85e9348b1383b3683975aa23df0905fe3bb84913ae4092957fb23962f90618d01a7f4a8a54493713f1238ca8e58c80540c5cd183806ed4d7cdb4"

RPROVIDES:${PN} += "libFcitx5GClient.so.2()(64bit) \
libFcitx5GClient2 \
libFcitx5GClient2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
