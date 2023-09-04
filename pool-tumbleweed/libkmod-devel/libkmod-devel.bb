SUMMARY = "Development files for libkmod"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases. \
 \
This package contains the development headers for the library found \
in libkmod2."
LICENSE = "LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "libkmod-devel-30-8.1.aarch64.rpm"
RPM_HASH = "1e337a7edbf58ce4f89d1079f5732b7b6c757db7615d932ca6702bb5c23a41408fc7fb22590b107fad8c7c93f595eaf447adbc8d97525161abbcc1577a6590e4"

RPROVIDES:${PN} += "libkmod-devel \
pkgconfig-libkmod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkmod2"

inherit rpm
