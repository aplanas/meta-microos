SUMMARY = "Libraries for gr-iqbal"
DESCRIPTION = "I/Q balancing for GNU Radio"
LICENSE = "GPL-2.0-only"

PV = "0.39.0git20210108"

RPM_NAME = "libgnuradio-iqbalance3_9_0-0.39.0git20210108-1.12.aarch64.rpm"
RPM_HASH = "ff45b610eb1374aa7d91a982b165b82b8e1620659594b9454f8659c32ced42013c24c2c0af9be71153520b907d92601ca0e54549e55424beb6affcc574ddcfb4"

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
