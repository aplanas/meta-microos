SUMMARY = "GClient library for fcitx5"
DESCRIPTION = "This package provides GClient library for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "libFcitx5GClient2-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "54d996a8da7f85e9348b1383b3683975aa23df0905fe3bb84913ae4092957fb23962f90618d01a7f4a8a54493713f1238ca8e58c80540c5cd183806ed4d7cdb4"

RPROVIDES:${PN} += "libFcitx5GClient.so.2 \
libFcitx5GClient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
