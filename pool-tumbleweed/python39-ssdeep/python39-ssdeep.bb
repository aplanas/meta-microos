SUMMARY = "Python wrapper for the ssdeep library"
DESCRIPTION = "A Python wrapper for ssdeep, which is a library for computing context triggered piecewise hashes (CTPH). Also called fuzzy hashes, CTPH can match inputs that have homologies. Such inputs \
have sequences of identical bytes in the same order, although bytes in between these sequences may be different in both \
content and length."
LICENSE = "LGPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "python39-ssdeep-3.4.1-1.6.aarch64.rpm"
RPM_HASH = "1b0e41b8f90545de4a45e214762821213dedc3be49e5ba348a77037b32e9256c88b50d98c0bbd0df6aee1ce3c2df1c8ff7020ebff313980c27d449dccc123d79"

RPROVIDES:${PN} += "python3.9dist-ssdeep \
python39-ssdeep \
python3dist-ssdeep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuzzy.so.2 \
python-abi \
python39-cffi \
ssdeep"

inherit rpm
