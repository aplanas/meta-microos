SUMMARY = "Rapid fuzzy string matching"
DESCRIPTION = "RapidFuzz is a fast string matching library for Python and C++, which is using the string similarity calculations from FuzzyWuzzy."
LICENSE = "MIT"

PV = "2.13.7"

RPM_NAME = "python39-rapidfuzz-2.13.7-3.2.aarch64.rpm"
RPM_HASH = "2e1f8e4aff33840af606b0da16e587bd856164725985da4f5767da96572d8efa626724e311cb77d30ea769bcd7fc9af31031ae9e2c5568a1762cc92486f0252d"

RPROVIDES:${PN} += "python3.9dist-rapidfuzz \
python39-rapidfuzz \
python3dist-rapidfuzz"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
