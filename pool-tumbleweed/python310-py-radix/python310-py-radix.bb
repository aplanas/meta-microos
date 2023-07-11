SUMMARY = "Radix tree implementation"
DESCRIPTION = "Implements the radix tree data structure for the storage and \
retrieval of IPv4 and IPv6 network prefixes. \
 \
The radix tree is commonly used for routing table lookups. It efficiently \
stores network prefixes of varying lengths and allows fast lookups of \
containing networks. \
 \
This package includes the C-extension."
LICENSE = "ISC & BSD-4-Clause"

PV = "0.10.0"

RPM_NAME = "python310-py-radix-0.10.0-1.29.aarch64.rpm"
RPM_HASH = "e21f97f12fe47722e98051280a83b446e229f90ee5366a67e443bf2e5d85611f342a43bb45955a38c42bbc3abfba4e71eeaf3c119414d779009a26492fd05c19"

RPROVIDES:${PN} += "python3.10dist-py-radix \
python310-py-radix \
python3dist-py-radix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
