SUMMARY = "Shared library for librtprocess"
DESCRIPTION = "This is a project that aims to make some of RawTherapee's highly optimized raw \
processing routines readily available for other FOSS photo editing software. \
 \
This package holds the shared library."
LICENSE = "BSL-1.0 & GPL-3.0-or-later"

PV = "0.12.0+20211228"

RPM_NAME = "librtprocess0-0.12.0+20211228-1.7.aarch64.rpm"
RPM_HASH = "d4490d0de9e4f4cb51aeac40b4c174a7037a7215028641fdbd39ed4c9d981fb7f92a715f6e12f38a2200d98cfbffc8850e7edc24dbd6eb5857f6f635bbba16b6"

RPROVIDES:${PN} += "librtprocess.so.0 \
librtprocess0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
