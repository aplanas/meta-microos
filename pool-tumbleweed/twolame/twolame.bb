SUMMARY = "An optimised MPEG Audio Layer 2 (MP2) encoder"
DESCRIPTION = "TwoLAME is an optimised MPEG Audio Layer 2 (MP2) encoder based on \
tooLAME by Mike Cheng, which in turn is based upon the ISO dist10 \
code and portions of LAME. TwoLAME includes libtwolame, a fully \
thread-safe shared library with an API very similar to LAME's."
LICENSE = "LGPL-2.1-only"

PV = "0.4.0"

RPM_NAME = "twolame-0.4.0-1.14.aarch64.rpm"
RPM_HASH = "a58d04617dc1410a29ea8b689b2c8c371541a3e943175239bedebe37e9c6a4d55d334eacd3c33e36131f5dfe44d8520986d39460e25b2892761b9e4d8df92cbf"

RPROVIDES:${PN} += "twolame \
twolame(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsndfile.so.1()(64bit) \
libtwolame.so.0()(64bit)"

inherit rpm
