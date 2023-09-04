SUMMARY = "Configuration library for fcitx5"
DESCRIPTION = "This package provides configuration libraries for fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libFcitx5Config6-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "ddbd06918a4d131cc273721d14a355fe9e870b339448071822756e79e6dc42a30693327dfd52bf028493bad2f64beaad854306576d2e85d2be9db9322875278b"

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
