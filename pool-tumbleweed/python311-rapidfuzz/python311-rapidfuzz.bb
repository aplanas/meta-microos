SUMMARY = "Rapid fuzzy string matching"
DESCRIPTION = "RapidFuzz is a fast string matching library for Python and C++, which is using the string similarity calculations from FuzzyWuzzy."
LICENSE = "MIT"

PV = "2.13.7"

RPM_NAME = "python311-rapidfuzz-2.13.7-3.1.aarch64.rpm"
RPM_HASH = "3dcee5f6800a97bd45ae6453b9a0d0ee38bba62a74ee01799c4527cdf06ec64baed4592c49184963c70d277a1d0b232b830785e5dc389659b66a792a0a022563"

RPROVIDES:${PN} += "python3.11dist-rapidfuzz \
python311-rapidfuzz \
python3dist-rapidfuzz"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
