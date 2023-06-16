SUMMARY = "Open Virtual Network VTEP controller for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN VTEP (VXLAN Tunnel Endpoint) controller."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-vtep-23.03.0-14.1.aarch64.rpm"
RPM_HASH = "dacc437be55cd146d2b09f9b56a1389a556896c11145d7b12fc20474d6033cbf16afd3fe1098619f0dc344ca83ba53ccc76f8a958fae933ed6c5fffd258af9b3"

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
