SUMMARY = "Open Virtual Network support for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN database and northbound daemon."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-central-23.03.0-15.1.aarch64.rpm"
RPM_HASH = "f8d97d25a616c9ba04c8c28fc255f9bd184d4c544f156f866bb5ab7c89a4880caf4e0c2e144ddaddca1c363c6ad7c0538c3de8536273c9340af0eddcfba6bb6e"

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
