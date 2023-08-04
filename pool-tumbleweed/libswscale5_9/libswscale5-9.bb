SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libswscale5_9-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "e6acfd5433e897137a4a30f19c509f10f6c722159c0848f33251a385e392f62a554411f52b6116cefbcdb6dcd57feae582679ac9aa2dbcae31a519a07e8ed326"

RPROVIDES:${PN} += "libswscale.so.5.9 \
libswscale5-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libm.so.6"

inherit rpm
