SUMMARY = "Python wrapper for the ssdeep library"
DESCRIPTION = "A Python wrapper for ssdeep, which is a library for computing context triggered piecewise hashes (CTPH). Also called fuzzy hashes, CTPH can match inputs that have homologies. Such inputs \
have sequences of identical bytes in the same order, although bytes in between these sequences may be different in both \
content and length."
LICENSE = "LGPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "python310-ssdeep-3.4.1-1.4.aarch64.rpm"
RPM_HASH = "f0c6be8637af46f72f1b4c9b0eb0388161fa804faad99d022f3b429d2a8f4ed54a740c9ae422b65de456351a6b7cb7955e47dff5bddcb0f460dec8a2c3134d72"

RPROVIDES:${PN} += "python3-ssdeep \
python3.10dist(ssdeep) \
python310-ssdeep \
python310-ssdeep(aarch-64) \
python3dist(ssdeep)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfuzzy.so.2()(64bit) \
python(abi) \
python310-cffi \
ssdeep"

inherit rpm
