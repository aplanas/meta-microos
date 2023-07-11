SUMMARY = "Open vSwitch test package"
DESCRIPTION = "Open vSwitch is a software-based Ethernet switch. \
 \
This package contains utilities that are useful to diagnose \
performance and connectivity issues in Open vSwitch setup."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-test-3.1.0-14.3.aarch64.rpm"
RPM_HASH = "ac1e24660fced58ab1864827c5a3485cab5d8ffba180092855df00883314289f9d68c438a1f15ab5816cebdd69a3dc3f22c8bf25a66f96d2a157a4e010bd5145"

RPROVIDES:${PN} += "openvswitch-test \
python3-openvswitch-test"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.1.so.0 \
openvswitch \
python-abi \
python3 \
python3-Twisted \
python3-ovs"

inherit rpm
