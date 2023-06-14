SUMMARY = "Configuration library for fcitx5"
DESCRIPTION = "This package provides configuration libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.23"

RPM_NAME = "libFcitx5Config6-5.0.23-1.1.aarch64.rpm"
RPM_HASH = "13487ae7ed3234192b01a64adfe590f43d4c1e80ce6c7582146f2a3f6434a87dc7a30e7cbaad946aee80173c52b21da99e43a98552a823f2d30550ce84506578"

RPROVIDES:${PN} += "libFcitx5Config.so.6 \
libFcitx5Config5 \
libFcitx5Config6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
