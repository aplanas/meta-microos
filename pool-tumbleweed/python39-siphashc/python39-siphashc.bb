SUMMARY = "Python C module to calculate SipHashes"
DESCRIPTION = "A Python C module for siphash. SipHash is an add–rotate–xor (ARX) \
based family of pseudorandom functions. \
 \
SipHash is fundamentally different from cryptographic hash functions \
like SHA in that SipHash is only suitable as a message authentication \
code."
LICENSE = "ISC"

PV = "1.3"

RPM_NAME = "python39-siphashc-1.3-3.15.aarch64.rpm"
RPM_HASH = "d76b24fb8a0ee6250eccb03d875d7de5467981e5665731a6567a293c561c70ca8943d8ce7df7056c7b86a770ad450e8f68188fa495d7b6b880d28d4f7adae6d2"

RPROVIDES:${PN} += "python3.9dist(siphashc) \
python39-siphashc \
python39-siphashc(aarch-64) \
python39-siphashc3 \
python3dist(siphashc)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi)"

inherit rpm
