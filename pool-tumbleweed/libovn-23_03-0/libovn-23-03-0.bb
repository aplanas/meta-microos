SUMMARY = "Open Virtual Network core libraries"
DESCRIPTION = "This subpackage contains the OVN shared libraries."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "libovn-23_03-0-23.03.0-15.1.aarch64.rpm"
RPM_HASH = "1d3d9b9e8c376e6a2eb1223ace34992a57755435173b59efc9bf40e7e5302b5ecae2bc72040631a5787d6040a7288fd5a529e898fcee48ab5813d42297d1f748"

RPROVIDES:${PN} += "libovn-23-03-0 \
libovn-23.03.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.1.so.0"

inherit rpm
