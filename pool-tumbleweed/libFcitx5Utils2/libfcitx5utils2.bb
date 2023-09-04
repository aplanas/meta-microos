SUMMARY = "Utility library for fcitx5"
DESCRIPTION = "This package provides utility libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libFcitx5Utils2-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "6ce73106e0632908ec97e27e4b5ea4ffe171a51d5e76cfa2312e26d7f443ee0407bd2b492f545038715c06975e2e38237408af011b5bfc33527f53e4500bd666"

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
