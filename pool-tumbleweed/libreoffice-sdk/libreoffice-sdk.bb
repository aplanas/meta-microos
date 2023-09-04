SUMMARY = "LibreOffice SDK"
DESCRIPTION = "This package contains the files needed to build plugins/add-ons for \
LibreOffice. It includes header files, IDL files, needed build \
tools, etc. \
 \
The documentation is in the package libreoffice-sdk-doc"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-sdk-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "02e81589ce6927d6926f078ed841bfd52e7195bc36a27961d1752105c0f4bec6d592bbe6620bc4ad51016cd3b8abb17a505dd7e929c4affa414e723f2cd0a54d"

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
