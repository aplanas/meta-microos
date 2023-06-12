SUMMARY = "Open Virtual Network core libraries"
DESCRIPTION = "This subpackage contains the OVN shared libraries."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "libovn-23_03-0-23.03.0-14.1.aarch64.rpm"
RPM_HASH = "0a726f508d24e16c71a205dd8241fae222a9c662f1305f7b539a8340425ca68851fad591999310e95d03bee224ab2ed240db2764dc4947b3bf2ebef099224eae"

RPROVIDES:${PN} += "libovn-23.03.so.0()(64bit) \
libovn-23.03.so.0(libovn_0)(64bit) \
libovn-23_03-0 \
libovn-23_03-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libopenvswitch-3.1.so.0()(64bit) \
libopenvswitch-3.1.so.0(libopenvswitch_0)(64bit)"

inherit rpm
