SUMMARY = "Open Virtual Network VTEP controller for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN VTEP (VXLAN Tunnel Endpoint) controller."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-vtep-23.03.0-15.1.aarch64.rpm"
RPM_HASH = "2dd783c8088526fe5bbe88ad6b48f101795526c125d202906e9a144514277116f053b9b451f1551851706c87424ea39499242352501946bf87077fa78f58024a"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn-/usr/bin/ovn-controller-vtep \
openvswitch-ovn-/usr/bin/ovn-controller-vtep \
openvswitch-ovn-vtep \
ovn-vtep"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.1.so.0 \
libovn-23.03.so.0 \
libvtep-3.1.so.0 \
openvswitch \
ovn"

inherit rpm
