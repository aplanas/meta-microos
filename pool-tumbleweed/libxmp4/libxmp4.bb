SUMMARY = "Module Player library for MOD, S3M, IT and others"
DESCRIPTION = "libxmp is a module player library which supports many module formats, \
including Protacker MOD, ScreamTracker S3M and ImpulseTracker IT."
LICENSE = "LGPL-2.1-only"

PV = "4.5.0+g613.8e4a5e15"

RPM_NAME = "libxmp4-4.5.0+g613.8e4a5e15-1.4.aarch64.rpm"
RPM_HASH = "090ab7b599668c5c1ea737e77f5c6cdbcfadb61d8044d75085ceeccac894aec2e80f1e9da319d65cb6008d2e7f787accc5edd8793c377826c1ee3ac5232b299f"

RPROVIDES:${PN} += "libxmp.so.4()(64bit) \
libxmp4 \
libxmp4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
