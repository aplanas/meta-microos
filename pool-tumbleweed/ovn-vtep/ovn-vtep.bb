SUMMARY = "Open Virtual Network VTEP controller for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN VTEP (VXLAN Tunnel Endpoint) controller."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-vtep-23.03.0-14.3.aarch64.rpm"
RPM_HASH = "13345e1b568ff10715165cde47974a572eca25e892510a001e0dd916bca54730fe368c5e4a824a686d7922d55a2246571a69a20f4c622485315d3df05380f7b3"

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
