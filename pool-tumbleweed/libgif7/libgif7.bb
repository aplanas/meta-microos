SUMMARY = "A Library for Working with GIF Images"
DESCRIPTION = "This Library allows manipulating GIF Image files. Since the LZW patents \
have expired, giflib can again be used instead of libungif."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "libgif7-5.2.1-4.1.aarch64.rpm"
RPM_HASH = "fb30ee5536c9f0a1bef796b18f6d80436e25bdf542bf3cf2f8d2a70a9f6895161b72c40445df3baf89f04ebbadb6d817c66481b52f860800bb5d48b47eb4d2d8"

RPROVIDES:${PN} += "libgif.so.7 \
libgif7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
