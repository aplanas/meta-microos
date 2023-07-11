SUMMARY = "Documentation"
DESCRIPTION = "This package contains additional documentation files provided with \
the software. The manual pages are in the corresponding packages."
LICENSE = "MPL-2.0"

PV = "4.4.2.P1"

RPM_NAME = "dhcp-doc-4.4.2.P1-14.4.aarch64.rpm"
RPM_HASH = "e9906674d69820eeac3bcd836cd3fe1effd309e361989b1722bb9df055d8858f45ace840230582c7bf66a8256036efec8ffa39d17e92080d27394da311a2ed5c"

RPROVIDES:${PN} += "dhcp-doc"

RDEPENDS:${PN} += ""

inherit rpm
