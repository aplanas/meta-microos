SUMMARY = "Rapid fuzzy string matching"
DESCRIPTION = "RapidFuzz is a fast string matching library for Python and C++, which is using the string similarity calculations from FuzzyWuzzy."
LICENSE = "MIT"

PV = "2.13.7"

RPM_NAME = "python311-rapidfuzz-2.13.7-3.2.aarch64.rpm"
RPM_HASH = "02bf78f725efbd61fe4b4f6ae309b20b54265f3e1b58ade5055b7186b121b19dfb78599d9f6745c28a5313ba6771a996640a6e6b314975ef77acc9dd19edc7ce"

RPROVIDES:${PN} += "python3-rapidfuzz \
python3.11dist-rapidfuzz \
python311-rapidfuzz \
python3dist-rapidfuzz"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
