SUMMARY = "Lua support for fcitx"
DESCRIPTION = "Lua support for fcitx"
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.10"

RPM_NAME = "fcitx5-lua-5.0.10-1.4.aarch64.rpm"
RPM_HASH = "3ec835c4e3093fece3a26586dfee749b91ff8510496a388dc9e3e3a704094f742f6c405b650011d825d84328bc2020eea9deec7786ced8e16c07c123e990f94d"

RPROVIDES:${PN} += "fcitx5-lua \
libluaaddonloader.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Config.so.6 \
libFcitx5Core.so.7 \
libFcitx5Utils.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
