SUMMARY = "Development headers for libtfm1"
DESCRIPTION = "Contains development headers for libtfm1"
LICENSE = "SUSE-Public-Domain | WTFPL"

PV = "0.13.1"

RPM_NAME = "tomsfastmath-devel-0.13.1-1.8.aarch64.rpm"
RPM_HASH = "844c19cf39a6d40396ea694d88328985d66cc86959c055f2bbac40843093ef2cb4d9bfdaa4b14609857ff8e5aa61065d81f8e45f612c6606aeb57e8915adf81b"

RPROVIDES:${PN} += "pkgconfig-tomsfastmath \
tomsfastmath-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtfm1"

inherit rpm
