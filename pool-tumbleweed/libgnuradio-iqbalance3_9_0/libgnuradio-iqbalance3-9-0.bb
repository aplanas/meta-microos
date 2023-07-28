SUMMARY = "Libraries for gr-iqbal"
DESCRIPTION = "I/Q balancing for GNU Radio"
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "libgnuradio-iqbalance3_9_0-0.39.0git20210108-1.14.aarch64.rpm"
RPM_HASH = "3e614d25fbb6eb1d76de58c00e88c5d6b5300efdcc57ba80baea09d1b7a29bb3b49c113085a8e53cdfc99ceb606f036774c6f8b71f205ee679079d37c1bd0793"

RPROVIDES:${PN} += "libgnuradio-iqbalance.so.3.9.0 \
libgnuradio-iqbalance3-9-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-pmt.so.3.10.7 \
libgnuradio-runtime.so.3.10.7 \
libosmodsp.so.0 \
libstdc++.so.6"

inherit rpm
