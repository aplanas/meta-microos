SUMMARY = "Opensource JPEG 2000 Codec Implementation"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
It has been developed in order to promote the use of JPEG 2000, the new \
still-image compression standard from the Joint Photographic Experts Group \
(JPEG). \
 \
This package provides the codec executables."
LICENSE = "BSD-2-Clause"

PV = "2.5.0"

RPM_NAME = "openjpeg2-2.5.0-3.4.aarch64.rpm"
RPM_HASH = "60cc636835ebe4abb87baac4cb27bad91a9bbdc249026eb89b8a8530a179dd865c9325dcedf5e32e9644b683149e075f48bd1fdb55c047ccde1f36b79b33307c"

RPROVIDES:${PN} += "openjpeg2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblcms2.so.2 \
libm.so.6 \
libopenjp2.so.7 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm
