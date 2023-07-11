SUMMARY = "Long-term archive encryption tool"
DESCRIPTION = "Enchive is a tool to encrypt files to yourself for long-term archival. \
It's a focused, simple alternative to more complex solutions such as \
GnuPG or encrypted filesystems. \
 \
Files are secured with ChaCha20, Curve25519, and HMAC-SHA256."
LICENSE = "Unlicense"

PV = "3.5"

RPM_NAME = "enchive-3.5-1.13.aarch64.rpm"
RPM_HASH = "1c32e773e3e9e0ece1bbfba8675f3739ae620d8b8ffde7e89de2d4a1f5cba0e839f00dd5176ab2ef7e2655bd254241d5639ecc4093532b168a8bb5d77aa5e624"

RPROVIDES:${PN} += "enchive"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
