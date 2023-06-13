SUMMARY = "Hangul Wrapper for Fcitx5"
DESCRIPTION = "Hangul Wrapper for Fcitx5."
LICENSE = "LGPL-2.1-only"

PV = "5.0.11"

RPM_NAME = "fcitx5-hangul-5.0.11-1.1.aarch64.rpm"
RPM_HASH = "5dd2262f36f21e00433b8fa7ca7d8b53b97478769f0728ab9d9bbbb13641dbea8732d4f33517474358376687d8073693f05d15b80c363a17dcbdf0ebe2874051"

RPROVIDES:${PN} += "fcitx-hangul \
fcitx5-hangul \
fcitx5-hangul(aarch-64) \
metainfo() \
metainfo(org.fcitx.Fcitx5.Addon.Hangul.metainfo.xml)"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1()(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Core.so.7()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libhangul.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
