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
libreoffice-sdk(aarch-64) \
libreoffice-ure-devel"

RDEPENDS:${PN} += "/bin/sh \
gcc-c++ \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libreoffice \
libstdc++.so.6()(64bit) \
libuno_sal.so.3()(64bit) \
libuno_sal.so.3(UDK_3_0_0)(64bit) \
libuno_salhelpergcc3.so.3()(64bit) \
libuno_salhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libunoidllo.so()(64bit) \
make \
rtld(GNU_HASH) \
ucpp \
zip"

inherit rpm
