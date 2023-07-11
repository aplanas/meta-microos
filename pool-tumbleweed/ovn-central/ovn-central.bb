SUMMARY = "Open Virtual Network support for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN database and northbound daemon."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-central-23.03.0-14.3.aarch64.rpm"
RPM_HASH = "61af02b3b401b951e8dad9fa2cb310f93d4584fd52c05553d8ba18a3ef4b52af9ae9b575b1e353302c28f3e9509c9b757d0e511fc680c2538e565f5fe21aea36"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn-/usr/bin/ovn-northd \
openvswitch-ovn-/usr/bin/ovn-northd \
openvswitch-ovn-central \
ovn-central"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.1.so.0 \
libovn-23.03.so.0 \
openvswitch \
ovn"

inherit rpm
