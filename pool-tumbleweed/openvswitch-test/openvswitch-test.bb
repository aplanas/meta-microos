SUMMARY = "Open vSwitch test package"
DESCRIPTION = "Open vSwitch is a software-based Ethernet switch. \
 \
This package contains utilities that are useful to diagnose \
performance and connectivity issues in Open vSwitch setup."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-test-3.1.0-14.1.aarch64.rpm"
RPM_HASH = "33d4ca1959816315bc1a67db42bad10fe0518212bf5c25c8b61f7f3eec9255de10385a79bb3f7f734a1be1d1cb153f8aacbf970b68371c2937996336bb7781c3"

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
