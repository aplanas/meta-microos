SUMMARY = "Rapid fuzzy string matching"
DESCRIPTION = "RapidFuzz is a fast string matching library for Python and C++, which is using the string similarity calculations from FuzzyWuzzy."
LICENSE = "MIT"

PV = "2.13.7"

RPM_NAME = "python310-rapidfuzz-2.13.7-3.2.aarch64.rpm"
RPM_HASH = "3ef5041f592ffd5c5b8a00cc8f9d4fe736c79ed895afe6d7a04838fd547a240d93ecaed58809521fa07a0cca15bfe624890611acdba618d8afa77e888669b4a3"

RPROVIDES:${PN} += "python3.10dist-rapidfuzz \
python310-rapidfuzz \
python3dist-rapidfuzz"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
