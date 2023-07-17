SUMMARY = "Network UPS Tools Library (Uninterruptible Power Supply Monitoring)"
DESCRIPTION = "Shared library for the Network UPS Tools. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "libnutclient2-2.8.0-4.1.aarch64.rpm"
RPM_HASH = "a4dedf2a90c9478acd769bdf40d4e21f1e3f4060893b75096a8672af2f0f4dcdbf55a058dafadbeee17d369b8f99873c8fb9ff1a20c2abbc23a84072102b154d"

RPROVIDES:${PN} += "libnutclient.so.2 \
libnutclient2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
