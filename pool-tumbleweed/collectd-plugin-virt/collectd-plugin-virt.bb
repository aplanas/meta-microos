SUMMARY = "Virtual Machine Statistics Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to gather statistics from virtual \
machines using libvirt."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-virt-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "02b2e80e7cc743649eb0faccb9ad6d281bfc65921b53e9acddd8119c1bc89c6b6077078766cdf96ea4d3a1cd4657683c96699cdb44eb8a270e61d7a96b4dba53"

RPROVIDES:${PN} += "collectd-plugin-virt \
collectd-plugin-virt(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libvirt.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
