SUMMARY = "Development files for libkmod"
DESCRIPTION = "libkmod was created to allow programs to easily insert, remove and \
list modules, also checking its properties, dependencies and aliases. \
 \
This package contains the development headers for the library found \
in libkmod2."
LICENSE = "LGPL-2.1-or-later"

PV = "30"

RPM_NAME = "libkmod-devel-30-3.1.aarch64.rpm"
RPM_HASH = "7b558042bc2e71be6455de854b7c2a0264a6b140ba8fa4e23b892a78af3675cfb3edcbc374e5c4dba864a675ac3d3b58a672c84897f1a85c98945306fd62c909"

RPROVIDES:${PN} += "libkmod-devel \
pkgconfig-libkmod"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libkmod2"

inherit rpm
