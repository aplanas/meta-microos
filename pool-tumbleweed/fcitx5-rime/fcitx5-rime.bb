SUMMARY = "RIME support for Fcitx5"
DESCRIPTION = "This package provides RIME support for Fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.16"

RPM_NAME = "fcitx5-rime-5.0.16-1.1.aarch64.rpm"
RPM_HASH = "6beab984de714322e42a33601f84685598865a62056925a11398d637fea2d7b160890c9cbf970211d1d41471f257d7ea61a1a37fdfa05d73654609053d2e3bbe"

RPROVIDES:${PN} += "fcitx-rime \
fcitx5-rime"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
librime.so.1 \
libstdc++.so.6 \
rime"

inherit rpm
