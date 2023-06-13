SUMMARY = "Open Virtual Network support for Open vSwitch"
DESCRIPTION = "This subpackage contains the OVN database and northbound daemon."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-central-23.03.0-14.1.aarch64.rpm"
RPM_HASH = "f84beb860378032b0c38dc35017ae5436b243e5532622dec5773d05c23ef1c1ac5e35e67db082cd8e827c85d346fc4168ce8b843a8c65d43701dd9e966031cd6"

RPROVIDES:${PN} += "openvswitch-dpdk-ovn:/usr/bin/ovn-northd \
openvswitch-ovn-central \
openvswitch-ovn:/usr/bin/ovn-northd \
ovn-central \
ovn-central(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libopenvswitch-3.1.so.0()(64bit) \
libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit) \
libovn-23.03.so.0()(64bit) \
libovn-23.03.so.0(libovn_0)(64bit) \
openvswitch \
ovn"

inherit rpm
