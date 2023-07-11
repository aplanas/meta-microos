SUMMARY = "A DSP library for Telephony and SoftFAX"
DESCRIPTION = "SpanDSP is a library of DSP functions for telephony, in the 8000 sample \
per second world of E1s, T1s, and higher order PCM channels. It \
contains low level functions, such as basic filters. It also contains \
higher level functions, such as cadenced supervisory tone detection, \
and a complete software FAX machine."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0+g21"

RPM_NAME = "libspandsp3-3.0.0+g21-1.1.aarch64.rpm"
RPM_HASH = "3fa49751df99083ea139150423967f37bf534263ed46a5f1d138ddc2493d24d5ea3e1fccc88df1e70480852f63c1c41d084b1a54665b0a8d33feddca2d536ef1"

RPROVIDES:${PN} += "libspandsp.so.3 \
libspandsp3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libtiff.so.6"

inherit rpm
