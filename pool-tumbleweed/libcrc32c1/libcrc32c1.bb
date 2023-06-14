SUMMARY = "CRC32C implementation with support for CPU-specific acceleration instructions"
DESCRIPTION = "This project collects a few CRC32C implementations under an umbrella \
that dispatches to a suitable implementation based on the host computer's \
hardware capabilities. \
 \
CRC32C is specified as the CRC that uses the iSCSI polynomial in RFC 3720. \
The polynomial was introduced by G. Castagnoli, S. Braeuer and M. Herrmann."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "libcrc32c1-1.1.2-1.4.aarch64.rpm"
RPM_HASH = "a6eb68bb174cc066c0feed2ed3ec728fd43e8e168ae6c0275f0c8a0e525cf97d53268838d31d7388ca706e7a2d52b9cf537d40f7bd733ff18507d83819efd868"

RPROVIDES:${PN} += "libcrc32c.so.1 \
libcrc32c1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libstdc++.so.6"

inherit rpm
