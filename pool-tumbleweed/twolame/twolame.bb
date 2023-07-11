SUMMARY = "An optimised MPEG Audio Layer 2 (MP2) encoder"
DESCRIPTION = "TwoLAME is an optimised MPEG Audio Layer 2 (MP2) encoder based on \
tooLAME by Mike Cheng, which in turn is based upon the ISO dist10 \
code and portions of LAME. TwoLAME includes libtwolame, a fully \
thread-safe shared library with an API very similar to LAME's."
LICENSE = "LGPL-2.1-only"

PV = "0.4.0"

RPM_NAME = "twolame-0.4.0-1.15.aarch64.rpm"
RPM_HASH = "108518008364dd431612a44ef63a2546ea27027cf7cb3430335a1ffd0164f02706feb3041ecb828616a8a9bc0a389f9c1538ffff12a1ae084869e73a2147cfbd"

RPROVIDES:${PN} += "twolame"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsndfile.so.1 \
libtwolame.so.0"

inherit rpm
