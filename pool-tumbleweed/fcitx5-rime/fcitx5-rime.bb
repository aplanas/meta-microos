SUMMARY = "RIME support for Fcitx5"
DESCRIPTION = "This package provides RIME support for Fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.16"

RPM_NAME = "fcitx5-rime-5.0.16-1.1.aarch64.rpm"
RPM_HASH = "6beab984de714322e42a33601f84685598865a62056925a11398d637fea2d7b160890c9cbf970211d1d41471f257d7ea61a1a37fdfa05d73654609053d2e3bbe"

RPROVIDES:${PN} += "fcitx-rime \
fcitx5-rime \
fcitx5-rime(aarch-64) \
metainfo() \
metainfo(org.fcitx.Fcitx5.Addon.Rime.metainfo.xml)"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1()(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Core.so.7()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
librime.so.1()(64bit) \
libstdc++.so.6()(64bit) \
rime"

inherit rpm
