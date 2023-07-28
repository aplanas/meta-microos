SUMMARY = "Development files for libkmod"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases. \
 \
This package contains the development headers for the library found \
in libkmod2."
LICENSE = "LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "libkmod-devel-30-6.1.aarch64.rpm"
RPM_HASH = "bdd7ac683ccd8cbb8a04d5149347a83a05a7493ee3e826527754f2838c60eec91acf2a928a428b161fa7db099515d84e87f8511a85fc948f1d677593c01837b2"

RPROVIDES:${PN} += "libkmod-devel \
pkgconfig-libkmod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkmod2"

inherit rpm
