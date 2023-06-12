SUMMARY = "Open vSwitch (OVS) plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor an OVS database."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-ovs-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "9ab9ae3103e64a473ad09b1b412513f5fef0e69cd13b4e1bb808b2331f768156d4e75ca51c2cbeee691fe5a1f262d27f2aa77b84a48434835dd9cad5f22b8cf5"

RPROVIDES:${PN} += "collectd-plugin-ovs \
collectd-plugin-ovs(aarch-64)"
RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libyajl.so.2()(64bit)"

inherit rpm
