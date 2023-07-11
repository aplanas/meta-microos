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

RPM_NAME = "python39-py-radix-0.10.0-1.29.aarch64.rpm"
RPM_HASH = "11c2d0cca52f173018ec0b3dd6db09ae7efbbb6cbaed270285bcd6a124a3cb5d18894b61aea1ab1cf87b43cad3fe6fb41fbd0f466c15839f56eaeffeae671672"

RPROVIDES:${PN} += "python3.9dist-py-radix \
python39-py-radix \
python3dist-py-radix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
