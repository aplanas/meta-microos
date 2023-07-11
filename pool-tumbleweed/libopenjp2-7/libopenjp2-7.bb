SUMMARY = "Opensource JPEG 2000 Codec Implementation"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
It has been developed in order to promote the use of JPEG 2000, the new \
still-image compression standard from the Joint Photographic Experts Group \
(JPEG)."
LICENSE = "BSD-2-Clause"

PV = "2.5.0"

RPM_NAME = "libopenjp2-7-2.5.0-3.4.aarch64.rpm"
RPM_HASH = "5b354809041c36d28f7080147d4195b1f2dbec0673c5d6c542a2708aa69904d448416b24873ec4276bbf4ee26b3d1d4ef68f07303fe14bb1b7b6574b28fa7c5d"

RPROVIDES:${PN} += "libopenjp2-7 \
libopenjp2.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
