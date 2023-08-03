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

RPM_NAME = "python39-fastnumbers-5.0.1-1.1.aarch64.rpm"
RPM_HASH = "f8cf8f9bdda1ec410f61c58e6a5317e58397672f52c2178818ea328123512a63754c4f0efdd3d0264c2aa7584bd526cc16e22b847500f9d212176e958b490cc5"

RPROVIDES:${PN} += "python3.9dist-fastnumbers \
python39-fastnumbers \
python3dist-fastnumbers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
