SUMMARY = "Open Virtual Network support for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN host controller."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-host-23.03.0-15.1.aarch64.rpm"
RPM_HASH = "6804635a6bf22546fff12be0921a8952217ddb50618271d5d25a733b820440d7fd5c17d4f2ece7b7f72e33be5156d5c33ff27ea8bbf021d4dfe3157bcfdfaa2c"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn-/usr/bin/ovn-controller \
openvswitch-ovn-/usr/bin/ovn-controller \
openvswitch-ovn-host \
ovn-host"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.1.so.0 \
libovn-23.03.so.0 \
openvswitch \
ovn"

inherit rpm
