SUMMARY = "Utility library for fcitx5"
DESCRIPTION = "This package provides utility libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "libFcitx5Utils2-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "b2f95de823e1a7366027dae7d2ee7e9d3d2d7d4a1813c038126cdd4879b5ffc2b0bf4ce32c006ec0686057c9d21a02a0356e7641db0aed1fd74dbeff82087dc9"

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
