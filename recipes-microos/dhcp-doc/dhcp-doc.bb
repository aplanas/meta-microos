SUMMARY = "Documentation"
DESCRIPTION = "This package contains additional documentation files provided with \
the software. The manual pages are in the corresponding packages."
LICENSE = "MPL-2.0"

PV = "4.4.2.P1"

RPM_NAME = "dhcp-doc-4.4.2.P1-14.3.aarch64.rpm"
RPM_HASH = "0120dc8ed0e8184cb91bfce197fbf7e854a43bcdd25d891f5feba77d614d0c2041df54bb730b3123b8168e831474da6e9448fcfda5578127e98ae21854723ca5"

RPROVIDES:${PN} += "dhcp-doc dhcp-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
