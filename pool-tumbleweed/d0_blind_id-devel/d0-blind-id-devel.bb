SUMMARY = "Development files for the Blind-ID library"
DESCRIPTION = "Development files for the Blind-ID library for user identification using \
RSA blind signatures"
LICENSE = "BSD-3-Clause"

PV = "0.8.5"

RPM_NAME = "d0_blind_id-devel-0.8.5-1.1.aarch64.rpm"
RPM_HASH = "b8a428c71cfb378f67deac9b1fe15b780d2143f17d49ffaec50bd54595c0fd8e717887fbca2c617414db4aaeadcfa2c6b534562df80e50b8f86023b953e2b649"

RPROVIDES:${PN} += "d0_blind_id-devel \
d0_blind_id-devel(aarch-64) \
pkgconfig(d0_blind_id) \
pkgconfig(d0_rijndael)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libd0_blind_id0 \
libd0_rijndael0"

inherit rpm
