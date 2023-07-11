SUMMARY = "LibreOffice SDK"
DESCRIPTION = "This package contains the files needed to build plugins/add-ons for \
LibreOffice. It includes header files, IDL files, needed build \
tools, etc. \
 \
The documentation is in the package libreoffice-sdk-doc"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-sdk-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "58f4a71c97f71115e39cf11a1825403e31eafa79540a2af475130d293b1292f7ef3092c9a7010d654d61c0290c75d803643c280eb3c58c909586792907bfe7ab"

RPROVIDES:${PN} += "libreoffice-sdk \
libreoffice-ure-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc-c++ \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libreoffice \
libstdc++.so.6 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
libunoidllo.so \
make \
rtld-GNU-HASH \
ucpp \
zip"

inherit rpm
