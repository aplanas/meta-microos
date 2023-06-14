SUMMARY = "Long-term archive encryption tool"
DESCRIPTION = "Enchive is a tool to encrypt files to yourself for long-term archival. \
It's a focused, simple alternative to more complex solutions such as \
GnuPG or encrypted filesystems. \
 \
Files are secured with ChaCha20, Curve25519, and HMAC-SHA256."
LICENSE = "Unlicense"

PV = "3.5"

RPM_NAME = "enchive-3.5-1.12.aarch64.rpm"
RPM_HASH = "ea0e4c2bb52f5afd9277dfcfcbfeb3aabed3387d04e7428d745bd93e50cf5f6395e6f13df9d46019d04885ac27c32095daa6e9afd519c902bd2c82ccfa0763cd"

RPROVIDES:${PN} += "enchive"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
