SUMMARY = "Python C module to calculate SipHashes"
DESCRIPTION = "A Python C module for siphash. SipHash is an add–rotate–xor (ARX) \
based family of pseudorandom functions. \
 \
SipHash is fundamentally different from cryptographic hash functions \
like SHA in that SipHash is only suitable as a message authentication \
code."
LICENSE = "ISC"

PV = "2.1"

RPM_NAME = "python311-siphashc-2.1-1.1.aarch64.rpm"
RPM_HASH = "76c8c10cd2e28d0f8e9de32b6f9c19ef1fe637ba74e0701af18faf22bd52923bdae3bc8c9bde212cd006080da5e29a20c7144ddcc57e365e2fad1c5e034054a4"

RPROVIDES:${PN} += "python3-siphashc \
python3-siphashc3 \
python3.11dist-siphashc \
python311-siphashc \
python311-siphashc3 \
python3dist-siphashc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
