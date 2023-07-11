SUMMARY = "Module Player library for MOD, S3M, IT and others"
DESCRIPTION = "libxmp is a module player library which supports many module formats, \
including Protacker MOD, ScreamTracker S3M and ImpulseTracker IT."
LICENSE = "LGPL-2.1-only"

PV = "4.6.0"

RPM_NAME = "libxmp4-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "54189e7596e092de9d93d03d36839975449ea96e88c8aaaf6cd7eeb6f6afab1b2a0a14709c937eca2d99f70d53a254d47320eb7c5b9ff47089affe804242640d"

RPROVIDES:${PN} += "libxmp.so.4 \
libxmp4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
