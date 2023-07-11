SUMMARY = "Libraries for gr-iqbal"
DESCRIPTION = "I/Q balancing for GNU Radio"
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "libgnuradio-iqbalance3_9_0-0.39.0git20210108-1.13.aarch64.rpm"
RPM_HASH = "7df0cefed447057b106e8be0f089d4eb7bf819ccb14d175ba2ff56a0a24d03b9dea4045f2f8f25cea564581ee61c42e74654f4ca518c831df05025176dcbde1e"

RPROVIDES:${PN} += "libgnuradio-iqbalance.so.3.9.0 \
libgnuradio-iqbalance3-9-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-pmt.so.3.10.6 \
libgnuradio-runtime.so.3.10.6 \
libosmodsp.so.0 \
libstdc++.so.6"

inherit rpm
