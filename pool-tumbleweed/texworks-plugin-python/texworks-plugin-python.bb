SUMMARY = "Plugins to add python scripting to texworks"
DESCRIPTION = "The TeXworks project is a simple TeX front-end program (working \
environment) that is modeled on Dick Koch's TeXShop for Mac OS X. \
 \
This package adds python scripting abitilies to TeXworks."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.8"

RPM_NAME = "texworks-plugin-python-0.6.8-1.3.aarch64.rpm"
RPM_HASH = "1a1f0e6b90a9b7a82abd9a56dd447d4b2b6926c38323eb6d3335df7e19d88983061467eccf57a0f08a28dafdf3635fe5bf5c2a414ab612a47b9d71c475b46911"

RPROVIDES:${PN} += "libTWPythonPlugin.so \
texworks-plugin-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python \
texworks"

inherit rpm
