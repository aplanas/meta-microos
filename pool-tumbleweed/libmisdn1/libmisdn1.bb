SUMMARY = "mISDN core library"
DESCRIPTION = "The mISDN core library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.1.0+2.0.22+git6"

RPM_NAME = "libmisdn1-2.1.0+2.0.22+git6-2.7.aarch64.rpm"
RPM_HASH = "89816963749a5281ad760a84379882519bdcb3c669bfc95629c835c7df27b3dec7219b06d3bcda152c665165793c45ad7a165cfcbfb9f70d3fa50bcbe0d2625a"

RPROVIDES:${PN} += "libmisdn.so.1 \
libmisdn1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
