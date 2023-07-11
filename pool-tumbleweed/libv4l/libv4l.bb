SUMMARY = "Collection of video4linux support libraries"
DESCRIPTION = "libv4l is a collection of libraries which adds a thin abstraction layer on \
top of video4linux2 devices. The purpose of this (thin) layer is to make it \
easy for application writers to support a wide variety of devices without \
having to write separate code for different devices in the same class."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4l-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "b2e51c58943e2b95575bf80a31e0281fac6db52391a77da6b7212ff592b37ba25a43aea3fdfcda597d5490cca6515a00f7b0dda8ddb66d94172fbb0f3544435d"

RPROVIDES:${PN} += "libv4l \
libv4l-mplane.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libv4l1.so.0 \
libv4l2.so.0"

inherit rpm
