SUMMARY = "Utility library for fcitx5"
DESCRIPTION = "This package provides utility libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "libFcitx5Utils2-5.0.23-1.2.aarch64.rpm"
RPM_HASH = "b7fb415ca3b139407f3480dbf483ed9d090663c3301b1fdde80177b9dbf63ece3d04e0b08182f4a25262453a00859794f9839b513e20edf704c616801cac9cfa"

RPROVIDES:${PN} += "libFcitx5Utils.so.2 \
libFcitx5Utils1 \
libFcitx5Utils2 \
libfcitx-utils0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
