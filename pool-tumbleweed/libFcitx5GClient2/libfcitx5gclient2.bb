SUMMARY = "GClient library for fcitx5"
DESCRIPTION = "This package provides GClient library for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libFcitx5GClient2-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "0d40d59df64b11a3c88d09a00fce47af5ec5579ffed6efbe5314b734fdf9d1959988ab4a58e057a727e25b37808756a25aed00d813286c2a1e5d6d55febcf06b"

RPROVIDES:${PN} += "libFcitx5GClient.so.2 \
libFcitx5GClient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
