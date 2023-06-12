SUMMARY = "Python JSON encoder"
DESCRIPTION = "A Python 3 implementation of a JSON encoder for Python objects \
designed to be compatible with native JSON decoders in various web browsers."
LICENSE = "BSD-2-Clause"

PV = "0.9.6"

RPM_NAME = "python310-metamagic.json-0.9.6-4.10.aarch64.rpm"
RPM_HASH = "0167ad48f5c698991733f9cb6a742d8bc8697b4acf05783ef540e07e9a658697503fe75a999f25a4a1d2f1cf567cf71317e8d35ca8456e05b8b8593448761e54"

RPROVIDES:${PN} += "python3-metamagic.json \
python3.10dist(metamagic.json) \
python310-metamagic.json \
python310-metamagic.json(aarch-64) \
python3dist(metamagic.json)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
