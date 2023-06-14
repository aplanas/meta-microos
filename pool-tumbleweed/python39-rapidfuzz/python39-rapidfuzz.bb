SUMMARY = "Rapid fuzzy string matching"
DESCRIPTION = "RapidFuzz is a fast string matching library for Python and C++, which is using the string similarity calculations from FuzzyWuzzy."
LICENSE = "MIT"

PV = "2.13.7"

RPM_NAME = "python39-rapidfuzz-2.13.7-3.1.aarch64.rpm"
RPM_HASH = "fcb12e6b6394e79607e5eecd903e95a6df734c32f47f98ed3c929cce33922566e918ec4c387e5735da7c305ab36987590b66742829ff72de641908edcf57954c"

RPROVIDES:${PN} += "python3.9dist-rapidfuzz \
python39-rapidfuzz \
python3dist-rapidfuzz"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
