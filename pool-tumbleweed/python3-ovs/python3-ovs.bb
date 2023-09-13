SUMMARY = "Python3 bindings for Open vSwitch"
DESCRIPTION = "This package contains the Python3 bindings for Open vSwitch database."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "python3-ovs-3.1.0-15.1.aarch64.rpm"
RPM_HASH = "bb13ae76e72a677e729963fe7a3048b049edcaccfe99846c419be523f656c3753098bb800f84078a92427fa82bebe51311d0e16c56ef38926b41e82b210084df"

RPROVIDES:${PN} += "python3-openvswitch \
python3-ovs \
python3.11dist-ovs \
python3dist-ovs"

RDEPENDS:${PN} += "libopenvswitch-3-1-0 \
python-abi \
python3 \
python3-sortedcontainers"

inherit rpm
