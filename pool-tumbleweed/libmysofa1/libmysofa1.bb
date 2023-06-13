SUMMARY = "Reader for AES SOFA HRTF files"
DESCRIPTION = "This is a C library to read AES SOFA files that contain HRTFs stored \
according to the AES69-2015 standard."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libmysofa1-1.3.1-1.4.aarch64.rpm"
RPM_HASH = "70c1d98d07d7e455abed3fd885b6c4b18ac4134ce761694ceb0e6c27a4dd373eeed8e77647519f8971ae229cb2ad94ad827e000a369f2b523f812379c66b2489"

RPROVIDES:${PN} += "libmysofa.so.1()(64bit) \
libmysofa1 \
libmysofa1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
