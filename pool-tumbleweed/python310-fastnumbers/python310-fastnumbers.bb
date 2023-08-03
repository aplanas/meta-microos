SUMMARY = "Drop-in replacement for Python's int and float"
DESCRIPTION = "fastnumbers is a Python module with three objectives: \
 \
1. To provide drop-in replacements for the Python built-in `int` and \
   `float` that, on average, are around 2x faster. These functions \
   should behave identically to the Python built-ins except for a few \
   specific corner-cases as mentioned in the API documentation. \
2. To provide a set of convenience functions that wrap the above int \
   and float replacements and provide error handling. \
3. To provide a set of functions that can be used to identify whether \
   an input could be converted to int or float."
LICENSE = "MIT"

PV = "5.0.1"

RPM_NAME = "python310-fastnumbers-5.0.1-1.1.aarch64.rpm"
RPM_HASH = "852493fe7cfbac49d09335cc7273873f8904c727195c93e228b2c1dee3d50f4278a13c9ac637f42cac962ad0bb10d83661332992849ed116fb1fa6590759975d"

RPROVIDES:${PN} += "python3.10dist-fastnumbers \
python310-fastnumbers \
python3dist-fastnumbers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
