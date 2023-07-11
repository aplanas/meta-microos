SUMMARY = "Plugins to add python scripting to texworks"
DESCRIPTION = "The TeXworks project is a simple TeX front-end program (working \
environment) that is modeled on Dick Koch's TeXShop for Mac OS X. \
 \
This package adds lua scripting abitilies to TeXworks."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.8"

RPM_NAME = "texworks-plugin-lua-0.6.8-1.4.aarch64.rpm"
RPM_HASH = "5c95b695143b5c883fd32fd59d99774775e5dd22ccd71a6e22fb90ea37a880cdc96882668c4cebf1e286d861ed540ce28084aaba71dd52ee7465f8f3b6e972df"

RPROVIDES:${PN} += "libTWLuaPlugin.so \
texworks-plugin-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libstdc++.so.6 \
lua \
texworks"

inherit rpm
