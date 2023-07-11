SUMMARY = "NSS NIS plugin for glibc"
DESCRIPTION = "The NSS NIS plugin provides NIS support for get*nam() functions from \
glibc. This version is IPv6 capable."
LICENSE = "LGPL-2.1-only"

PV = "3.2"

RPM_NAME = "libnss_nis2-3.2-1.1.aarch64.rpm"
RPM_HASH = "fbd39ee1caa78776b2dcf7db8d1ac9abe7257e308ec2a94ead835dfea7d35ff8ad7e2c588fd26f54579e26725ddb32795898e349aeca2fd30ff8cd972c98016d"

RPROVIDES:${PN} += "glibc-/lib64/libnss-nis.so.2 \
libnss-nis.so.2 \
libnss-nis2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnsl.so.3"

inherit rpm
