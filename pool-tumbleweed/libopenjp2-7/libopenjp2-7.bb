SUMMARY = "Opensource JPEG 2000 Codec Implementation"
DESCRIPTION = "The OpenJPEG library is an open-source JPEG 2000 codec written in C language. \
It has been developed in order to promote the use of JPEG 2000, the new \
still-image compression standard from the Joint Photographic Experts Group \
(JPEG)."
LICENSE = "BSD-2-Clause"

PV = "2.5.0"

RPM_NAME = "libopenjp2-7-2.5.0-3.3.aarch64.rpm"
RPM_HASH = "bda4a93529803d35ef8fa925102ed5e156c6ff4d436dfa1162915afcac320b979b832316ccb6506a961a0779b93c941d8a2004f724854857c315a3649cebbc7e"

RPROVIDES:${PN} += "libopenjp2-7 \
libopenjp2.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
