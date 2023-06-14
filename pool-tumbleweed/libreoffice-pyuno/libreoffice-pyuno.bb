SUMMARY = "Python UNO Bridge for LibreOffice"
DESCRIPTION = "The Python-UNO bridge allows to use the standard LibreOffice API \
from the well known Python scripting language. It can be used to \
develop UNO components in python, thus python UNO components may be run \
within the LibreOffice process and can be called from Java, C++ or \
the built in StarBasic scripting language. You can create and invoke \
scripts with the office scripting framework (OOo 2.0 and later) with \
it. For example, it is used for the mail merge functionality. \
 \
You can find the more information at \
http://udk.openoffice.org/python/python-bridge.html"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-pyuno-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "5b747d7a5448f1e50d33a3029ffaad8a412096e68aaf2655719b823ea799811eb8d1e14da777b6ecd71019a5e5d45e501e54bfb48a40e864128de50f846960d2"

RPROVIDES:${PN} += "config-libreoffice-pyuno \
libpythonloaderlo.so \
libpyuno.so \
libreoffice-pyuno"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpython3.10.so.1.0 \
libreoffice \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
python-abi \
rtld-GNU-HASH"

inherit rpm
