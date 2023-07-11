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

RPM_NAME = "python311-py-radix-0.10.0-1.29.aarch64.rpm"
RPM_HASH = "14a418b11b9d6ba2e08ee6bba49cd2f705cf2e57896bd8b67d34d105a6d1e8b6dc265001ea0f0fb8472aaebd426ec420850eaeefc7cf05c543d0354c300d6385"

RPROVIDES:${PN} += "python3-py-radix \
python3.11dist-py-radix \
python311-py-radix \
python3dist-py-radix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
