SUMMARY = "Device mount library"
DESCRIPTION = "Library designed to be used in low-level utils like \
mount(8) and /usr/sbin/mount.<type> helpers."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libmount1-2.39-2.1.aarch64.rpm"
RPM_HASH = "7ed91d043db007866b0513da2eda850b939f75f642a4502610ba88a52397a7b72e083a57e6f209c4c6fc1df7b4afdbff322bac0a43385b1c35328e3ddcc6a1a4"

RPROVIDES:${PN} += "libmount.so.1 \
libmount1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libselinux.so.1"

inherit rpm
