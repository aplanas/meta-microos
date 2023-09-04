SUMMARY = "Libzhuyin Wrapper for Fcitx5"
DESCRIPTION = "Libzhuyin Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0"

RPM_NAME = "fcitx5-zhuyin-5.1.0-1.1.aarch64.rpm"
RPM_HASH = "d985b0371b092c5200bd4432912ce73ff1668a87114b3d4efb8761be3e6e5fc4d9415c4474bc3d7e6784cb10dd19c49e772877d7c97080d4d1bb43c9ee0ed2ef"

RPROVIDES:${PN} += "fcitx-zhuyin \
fcitx5-zhuyin"

RDEPENDS:${PN} += "fcitx5 \
ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6 \
libzhuyin.so.15"

inherit rpm
