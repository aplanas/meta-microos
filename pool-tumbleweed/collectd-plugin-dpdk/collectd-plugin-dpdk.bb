SUMMARY = "Collect DPDK interface statistics"
DESCRIPTION = "This plugin has a specific use case: monitoring DPDK applications \
that don't expose stats in any other way than the DPDK xstats API. \
For OVS or OVS-with-DPDK the Open vSwitch plugins (ovs) should be \
used for collecting stats and events."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-dpdk-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "cd4a9ace0d872a3e146463494f256ebccc18bc5add851265a8575499666cf685e428b6273bb5f245f947656af3e3cdb301a9c650eff2e095a2c7e911ded191d5"

RPROVIDES:${PN} += "collectd-plugin-dpdk"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
librte-eal.so.23 \
librte-ethdev.so.23"

inherit rpm
