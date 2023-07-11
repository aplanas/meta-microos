SUMMARY = "Shared libraries for TwoLame"
DESCRIPTION = "TwoLAME is an optimised MPEG Audio Layer 2 (MP2) encoder based on \
tooLAME by Mike Cheng, which in turn is based upon the ISO dist10 \
code and portions of LAME. TwoLAME includes libtwolame, a fully \
thread-safe shared library with an API very similar to LAME's. \
 \
This package contains the shared libraries for TwoLame."
LICENSE = "LGPL-2.1-only"

PV = "0.4.0"

RPM_NAME = "libtwolame0-0.4.0-1.15.aarch64.rpm"
RPM_HASH = "a1e77d14cec2db1f91b5fb9798ffbbc17e32f82d9023c58ad4b4f7947580e046312126865c7ab2840689c339c8076cb62ebbf1081267673d00e43a2e2592d4ac"

RPROVIDES:${PN} += "libtwolame.so.0 \
libtwolame0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
