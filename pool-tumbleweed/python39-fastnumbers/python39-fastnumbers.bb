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

PV = "3.2.1"

RPM_NAME = "python39-fastnumbers-3.2.1-1.9.aarch64.rpm"
RPM_HASH = "7876965b9dbca6dbe0b5d0b2fa0a5d0ea343b4e838a3d0707ab1eb5bae98b07facaee9346d78b6613621eee059e4e2877279d4f74c3abbfd3e18869f5bc42e99"

RPROVIDES:${PN} += "python3.9dist-fastnumbers \
python39-fastnumbers \
python3dist-fastnumbers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
