SUMMARY = "Python C module to calculate SipHashes"
DESCRIPTION = "A Python C module for siphash. SipHash is an add–rotate–xor (ARX) \
based family of pseudorandom functions. \
 \
SipHash is fundamentally different from cryptographic hash functions \
like SHA in that SipHash is only suitable as a message authentication \
code."
LICENSE = "ISC"

PV = "1.3"

RPM_NAME = "python310-siphashc-1.3-3.15.aarch64.rpm"
RPM_HASH = "8b4e578432a6a49f68315c00e009de1b0f6f0004ef4d58ac047404b8fa78014e5c5adc21059c10f056059f9dd4d9f6a791eddd93b0cebd3e00787ca9f64775ab"

RPROVIDES:${PN} += "python3-siphashc \
python3-siphashc3 \
python3.10dist(siphashc) \
python310-siphashc \
python310-siphashc(aarch-64) \
python310-siphashc3 \
python3dist(siphashc)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
