SUMMARY = "Lua support for fcitx"
DESCRIPTION = "Lua support for fcitx"
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.10"

RPM_NAME = "fcitx5-lua-5.0.10-1.3.aarch64.rpm"
RPM_HASH = "7dc3f504c033b9eae711ecdbd74a20fdc82e9e3e2715c927833bb496443a054ee6d81c371a6f692fb435a127d25df899a0f0267afb6fd72632beb7d64a9cc61c"

RPROVIDES:${PN} += "fcitx5-lua \
fcitx5-lua(aarch-64) \
libluaaddonloader.so()(64bit) \
metainfo() \
metainfo(org.fcitx.Fcitx5.Addon.Lua.metainfo.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Core.so.7()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
