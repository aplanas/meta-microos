SUMMARY = "Rapid fuzzy string matching"
DESCRIPTION = "RapidFuzz is a fast string matching library for Python and C++, which is using the string similarity calculations from FuzzyWuzzy."
LICENSE = "MIT"

PV = "2.13.7"

RPM_NAME = "python310-rapidfuzz-2.13.7-3.1.aarch64.rpm"
RPM_HASH = "cd1503fb09f48e72e5edd124b3b861add1dbc8e0b4a0887b141987f921e3afcae61dd851da90d71fb6c4c30c35bfbc8c75cf48eb69103c57636881b280d78dc8"

RPROVIDES:${PN} += "python3-rapidfuzz \
python3.10dist-rapidfuzz \
python310-rapidfuzz \
python3dist-rapidfuzz"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
