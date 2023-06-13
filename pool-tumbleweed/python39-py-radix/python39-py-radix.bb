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

RPM_NAME = "python39-py-radix-0.10.0-1.27.aarch64.rpm"
RPM_HASH = "8317e85adb3cafe7fb69af3e4675c543eae8daf0beff5a2eed8832dc0773c5f627c194551a422fff55e817ff24e845201db0d829b0e7a8c868604fdfa060f0b0"

RPROVIDES:${PN} += "python3.9dist(py-radix) \
python39-py-radix \
python39-py-radix(aarch-64) \
python3dist(py-radix)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
