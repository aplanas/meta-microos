SUMMARY = "CRC32C implementation with support for CPU-specific acceleration instructions"
DESCRIPTION = "This project collects a few CRC32C implementations under an umbrella \
that dispatches to a suitable implementation based on the host computer's \
hardware capabilities. \
 \
CRC32C is specified as the CRC that uses the iSCSI polynomial in RFC 3720. \
The polynomial was introduced by G. Castagnoli, S. Braeuer and M. Herrmann."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "libcrc32c1-1.1.2-1.5.aarch64.rpm"
RPM_HASH = "3a67c4f8459b5d1ac3dd08dc571a8ab85b7b61eddca308b52b15dccfdfde14a6918deeb38ced797aa991c38c4a750166c1d745fa44922755a8eb1d804b5047b4"

RPROVIDES:${PN} += "libcrc32c.so.1 \
libcrc32c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libstdc++.so.6"

inherit rpm
