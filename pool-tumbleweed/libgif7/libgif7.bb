SUMMARY = "A Library for Working with GIF Images"
DESCRIPTION = "This Library allows manipulating GIF Image files. Since the LZW patents \
have expired, giflib can again be used instead of libungif."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "libgif7-5.2.1-3.4.aarch64.rpm"
RPM_HASH = "7822e0b2c8a900021e82638b474411fd560be3e85bca9fc9c36aae0bbe579cd48b3a9248f78cdde828d4fa2d4a62b0c9df7913e350746d4d1cdfc71a4efc9484"

RPROVIDES:${PN} += "libgif.so.7 \
libgif7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
