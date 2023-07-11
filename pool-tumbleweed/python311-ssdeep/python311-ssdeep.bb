SUMMARY = "Python wrapper for the ssdeep library"
DESCRIPTION = "A Python wrapper for ssdeep, which is a library for computing context triggered piecewise hashes (CTPH). Also called fuzzy hashes, CTPH can match inputs that have homologies. Such inputs \
have sequences of identical bytes in the same order, although bytes in between these sequences may be different in both \
content and length."
LICENSE = "LGPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "python311-ssdeep-3.4.1-1.6.aarch64.rpm"
RPM_HASH = "6b0e73175348f5104f2dbca1f705457548e0bd0583dc3b917607f4a4dfeeaee5babfaccd6c7f43059386bf902d9fbdeed4d10100a42928dc84d8440de0233006"

RPROVIDES:${PN} += "python3-ssdeep \
python3.11dist-ssdeep \
python311-ssdeep \
python3dist-ssdeep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuzzy.so.2 \
python-abi \
python311-cffi \
ssdeep"

inherit rpm
