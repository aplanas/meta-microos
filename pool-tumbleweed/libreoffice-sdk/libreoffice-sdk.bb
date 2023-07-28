SUMMARY = "LibreOffice SDK"
DESCRIPTION = "This package contains the files needed to build plugins/add-ons for \
LibreOffice. It includes header files, IDL files, needed build \
tools, etc. \
 \
The documentation is in the package libreoffice-sdk-doc"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-sdk-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "c8335c8a1b9ed271c35e4371c54cb628188dd49c0329ec5daba0786dccb82fbd10038871ca3f8d596c5dd9acb2336a417b056299b64772219365950c2b771add"

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
