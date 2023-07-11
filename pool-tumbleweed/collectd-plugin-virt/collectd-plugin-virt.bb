SUMMARY = "Virtual Machine Statistics Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to gather statistics from virtual \
machines using libvirt."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-virt-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "e4cdcbd350b847f9a5526da437f62f832935fe2520d4228bedcd0b2b840015b5045130454336a6a4d3c3cded320fe2fd4a65f49f5ad9ae819f7282ffa7d3e9b6"

RPROVIDES:${PN} += "collectd-plugin-virt"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt.so.0 \
libxml2.so.2"

inherit rpm
