SUMMARY = "Collect DPDK interface statistics"
DESCRIPTION = "This plugin has a specific use case: monitoring DPDK applications \
that don't expose stats in any other way than the DPDK xstats API. \
For OVS or OVS-with-DPDK the Open vSwitch plugins (ovs) should be \
used for collecting stats and events."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-dpdk-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "36d65f4f475f3feb77294458b70c1f5df5657a6e224409e89992a0207c053d45bbd6e754dcbb1cdaf0f9948315f2e2a81d6f7d193343e06e4dfda0fa5ce50a0f"

RPROVIDES:${PN} += "collectd-plugin-dpdk"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
librte-eal.so.23 \
librte-ethdev.so.23"

inherit rpm
