SUMMARY = "Library to access different kinds of (video) capture devices"
DESCRIPTION = "Unicap provides a uniform interface to video capture devices. It allows \
applications to use any supported video capture device via a single API. \
The included ucil library provides easy to use functions to render text \
and graphic overlays onto video images."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.12"

RPM_NAME = "libunicap2-0.9.12-22.15.aarch64.rpm"
RPM_HASH = "87460c87ba8b4eb57a6ab51e0f8c3d6bc9e593f3ed28db329f5b96c0de789916ae994962bfde5457a871cbedd7ae63ff539fad00e4e04f9e521820d1f6374c2b"

RPROVIDES:${PN} += "libeuvccam-cpi.so \
libunicap.so.2 \
libunicap2 \
libv4l2cpi.so \
unicap"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libraw1394.so.11"

inherit rpm
