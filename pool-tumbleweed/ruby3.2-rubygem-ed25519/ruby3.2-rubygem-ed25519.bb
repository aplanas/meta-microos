SUMMARY = "An efficient digital signature library providing the Ed25519"
DESCRIPTION = "A Ruby binding to the Ed25519 elliptic curve public-key signature system \
described in RFC 8032."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "ruby3.2-rubygem-ed25519-1.3.0-1.11.aarch64.rpm"
RPM_HASH = "3c4db07a1ec8bdb6893b1f02e844dd9af6e197e696e2428d4fba7219947c5f334649d449aad94d655dd2b60f50a9dcf83f7a6c64d9bda295062410058f135b75"

RPROVIDES:${PN} += "ruby3.2-rubygem-ed25519 \
ruby3.2-rubygem-ed25519(aarch-64) \
rubygem(ed25519) \
rubygem(ruby:3.2.0:ed25519) \
rubygem(ruby:3.2.0:ed25519:1) \
rubygem(ruby:3.2.0:ed25519:1.3) \
rubygem(ruby:3.2.0:ed25519:1.3.0)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libruby3.2.so.3.2()(64bit) \
ruby(abi)"

inherit rpm
