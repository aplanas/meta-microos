SUMMARY = "Shared library part of opencore-amr"
DESCRIPTION = "Library of OpenCORE Framework implementation of Adaptive Multi Rate \
Narrowband speech codec."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "libopencore-amrnb0-0.1.6-1.4.aarch64.rpm"
RPM_HASH = "19f5d0f1a5ac9465f798ef4da5606ab59394bd09b56cb5853bd2a02aabba6a5910c1b5e1ad7f6545e7d16bb0f398b91c35a6630bd0e95bd47a77c1c3ac74a750"

RPROVIDES:${PN} += "libopencore-amrnb.so.0 \
libopencore-amrnb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
