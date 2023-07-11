SUMMARY = "XTRX's fork from myriadrf/LMS7002M-driver"
DESCRIPTION = "XTRX's fork from myriadrf/LMS7002M-driver."
LICENSE = "Apache-2.0"

PV = "0.0.0+git.20171206"

RPM_NAME = "libxtrx_lms7002m0_0_0-SUSE-0.0.0+git.20171206-1.22.aarch64.rpm"
RPM_HASH = "f8071a11fb6d93344b46fafe8c32361290f72b9cb3f31b8d05222d19606f689b31e8198de9ece681d61200380ff03d8a9109aa00ad8d7a4f854b27eab1753538"

RPROVIDES:${PN} += "libxtrx-lms7002m.so.0.0.0-SUSE \
libxtrx-lms7002m0-0-0-SUSE"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
