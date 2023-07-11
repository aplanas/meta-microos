SUMMARY = "Python C module to calculate SipHashes"
DESCRIPTION = "A Python C module for siphash. SipHash is an add–rotate–xor (ARX) \
based family of pseudorandom functions. \
 \
SipHash is fundamentally different from cryptographic hash functions \
like SHA in that SipHash is only suitable as a message authentication \
code."
LICENSE = "ISC"

PV = "2.1"

RPM_NAME = "python310-siphashc-2.1-1.1.aarch64.rpm"
RPM_HASH = "6ee3999f6b0806bf597b3b3335d000cc3ff1243a4ff682d1a723c130742355148268ae38d35dc68dcd2c4a589ffc8b99227e3448774ba73605bcf457d52e27c1"

RPROVIDES:${PN} += "python3.10dist-siphashc \
python310-siphashc \
python310-siphashc3 \
python3dist-siphashc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
