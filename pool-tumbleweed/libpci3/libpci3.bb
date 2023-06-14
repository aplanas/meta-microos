SUMMARY = "PCI utility library"
DESCRIPTION = "libpci offers access to the PCI configuration space."
LICENSE = "GPL-2.0-or-later"

PV = "3.10.0"

RPM_NAME = "libpci3-3.10.0-1.1.aarch64.rpm"
RPM_HASH = "f746584f578374a8e64aa2173cb4fd91bc2b05de1d8c49a3501442f9e40af28f753d0778d113131a0a036f446163cc2c7311b637953162edf35338d6fc10e98a"

RPROVIDES:${PN} += "libpci.so.3 \
libpci3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
