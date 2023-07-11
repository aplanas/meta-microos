SUMMARY = "Library for C error functions"
DESCRIPTION = "A library for C error functions. \
 \
This package is part of the libyal library collection and is used by \
other libraries in the collection."
LICENSE = "LGPL-3.0-or-later"

PV = "20220101"

RPM_NAME = "libcerror1-20220101-4.3.aarch64.rpm"
RPM_HASH = "060b422fd64353a6e1711533daf3363349f438160a21eeb397e202cfb460f689b49dd2c32b2f7f05f8db7fa5fa44ec5915fd0c5d3129d73b17f7ed51bd55efe6"

RPROVIDES:${PN} += "libcerror.so.1 \
libcerror1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
