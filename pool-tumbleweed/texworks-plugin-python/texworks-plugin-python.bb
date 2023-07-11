SUMMARY = "Plugins to add python scripting to texworks"
DESCRIPTION = "The TeXworks project is a simple TeX front-end program (working \
environment) that is modeled on Dick Koch's TeXShop for Mac OS X. \
 \
This package adds python scripting abitilies to TeXworks."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.8"

RPM_NAME = "texworks-plugin-python-0.6.8-1.4.aarch64.rpm"
RPM_HASH = "34040ee13c34998be2c01805aabf79f47a19d2905b73e0418250ca29f75230dac9a621036db501718f3f9df88988e99be813e7c882e8bb78653c0b507e29f578"

RPROVIDES:${PN} += "libTWPythonPlugin.so \
texworks-plugin-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python \
texworks"

inherit rpm
