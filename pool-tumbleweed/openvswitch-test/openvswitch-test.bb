SUMMARY = "Open vSwitch test package"
DESCRIPTION = "Open vSwitch is a software-based Ethernet switch. \
 \
This package contains utilities that are useful to diagnose \
performance and connectivity issues in Open vSwitch setup."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-test-3.1.0-15.1.aarch64.rpm"
RPM_HASH = "f6295a39ed13d30324b5b1021063867acd4fa2d2b050fb26f95c46f95277c7b7b4b5377df7f689bd48a08648d4a92758f5b5f628498ff53e46bfc12baa929c74"

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
