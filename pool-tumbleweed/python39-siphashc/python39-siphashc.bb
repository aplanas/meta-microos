SUMMARY = "Python C module to calculate SipHashes"
DESCRIPTION = "A Python C module for siphash. SipHash is an add–rotate–xor (ARX) \
based family of pseudorandom functions. \
 \
SipHash is fundamentally different from cryptographic hash functions \
like SHA in that SipHash is only suitable as a message authentication \
code."
LICENSE = "ISC"

PV = "2.1"

RPM_NAME = "python39-siphashc-2.1-1.1.aarch64.rpm"
RPM_HASH = "371e5abcad4904da65418d260852b237781270a3d7bf810da99064c5450c7acb6510da9b23f25ca0b7c9d4e3774f9d6a192cbf5b19e44fb635d91c2bf55964bf"

RPROVIDES:${PN} += "python3.9dist-siphashc \
python39-siphashc \
python39-siphashc3 \
python3dist-siphashc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
