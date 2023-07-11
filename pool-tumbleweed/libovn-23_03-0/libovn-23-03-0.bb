SUMMARY = "Open Virtual Network core libraries"
DESCRIPTION = "This subpackage contains the OVN shared libraries."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "libovn-23_03-0-23.03.0-14.3.aarch64.rpm"
RPM_HASH = "be69b36c0e8c190a0d49a98a9ae64736a33776eb6ce58f48de676acd86e098fbf0f4849f4ecba16c5ea347f39958b35546d2f74f2c9820fa6f600bf699080394"

RPROVIDES:${PN} += "libovn-23-03-0 \
libovn-23.03.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenvswitch-3.1.so.0"

inherit rpm
