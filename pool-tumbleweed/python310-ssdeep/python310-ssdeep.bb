SUMMARY = "Python wrapper for the ssdeep library"
DESCRIPTION = "A Python wrapper for ssdeep, which is a library for computing context triggered piecewise hashes (CTPH). Also called fuzzy hashes, CTPH can match inputs that have homologies. Such inputs \
have sequences of identical bytes in the same order, although bytes in between these sequences may be different in both \
content and length."
LICENSE = "LGPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "python310-ssdeep-3.4.1-1.6.aarch64.rpm"
RPM_HASH = "486c1edd951a4417909b15e373c0243101538b0a636ed9adb2ed45b724e19b052b2293123b0b757d845ffe2a9f936c532516c7db6043de9f8fa29c29fe37d8a9"

RPROVIDES:${PN} += "python3.10dist-ssdeep \
python310-ssdeep \
python3dist-ssdeep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuzzy.so.2 \
python-abi \
python310-cffi \
ssdeep"

inherit rpm
