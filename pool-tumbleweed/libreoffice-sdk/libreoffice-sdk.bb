SUMMARY = "LibreOffice SDK"
DESCRIPTION = "This package contains the files needed to build plugins/add-ons for \
LibreOffice. It includes header files, IDL files, needed build \
tools, etc. \
 \
The documentation is in the package libreoffice-sdk-doc"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-sdk-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "28842057cc0b5f6760db875f03ace3fdc1e8d74e590732f6370e2e6fb8286f5b12c6a0b9f2ca646e182df5d1e1bffb92fa84080578d4ccf493645158c67cc62f"

RPROVIDES:${PN} += "libreoffice-sdk \
libreoffice-ure-devel"

RDEPENDS:${PN} += "/bin/sh \
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
