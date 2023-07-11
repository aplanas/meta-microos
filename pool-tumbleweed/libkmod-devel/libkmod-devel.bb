SUMMARY = "Development files for libkmod"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases. \
 \
This package contains the development headers for the library found \
in libkmod2."
LICENSE = "LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "libkmod-devel-30-5.1.aarch64.rpm"
RPM_HASH = "e3ff488d4b47451a67f1f9caebca96c2c5ebb618b65361a1767097d9181b3dbf06bd50abbeac3f0a9360f68221209aae2acedc0a4e343f5676aa89f3e8de43b9"

RPROVIDES:${PN} += "libkmod-devel \
pkgconfig-libkmod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkmod2"

inherit rpm
