SUMMARY = "Header files for Developers Image Library"
DESCRIPTION = "Developer's Image Library (DevIL) is a programmer's library to develop \
applications with image loading capabilities. \
 \
This package contains the development libraries and headers."
LICENSE = "LGPL-2.1-only"

PV = "1.7.8"

RPM_NAME = "DevIL-devel-1.7.8-11.12.aarch64.rpm"
RPM_HASH = "f0e899362bf76bc80c93c43eea8ccf1d425c9165f78d685184ecf66766f2f4312a727774ccf54c07a85496318b89153ca81f70f559021a6bba5b907d82f16231"

RPROVIDES:${PN} += "DevIL-devel \
libdevil-devel \
pkgconfig-IL \
pkgconfig-ILU \
pkgconfig-ILUT"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libIL1 \
pkgconfig-IL"

inherit rpm
