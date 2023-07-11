SUMMARY = "Reader for AES SOFA HRTF files"
DESCRIPTION = "This is a C library to read AES SOFA files that contain HRTFs stored \
according to the AES69-2015 standard."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libmysofa1-1.3.1-2.1.aarch64.rpm"
RPM_HASH = "466442f58edc9bd147d46f337d319316f3b36ab754965a47e5dc02e6274f66b8dbd65e3f32a4d4cafd7d02d0d4334569e50ae617d8f13c5d4137589a4f6df399"

RPROVIDES:${PN} += "libmysofa.so.1 \
libmysofa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
