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

RPM_NAME = "python39-fastnumbers-3.2.1-1.8.aarch64.rpm"
RPM_HASH = "ff96e7cd86af4246967ab1e3c64f0c2b527d66c27156ac3240fff16a528a4b951f75f6a3a132cbcfa7e4d8dc18abcd44d10a906458ef347e6a61807e18d29cbd"

RPROVIDES:${PN} += "python3.9dist(fastnumbers) \
python39-fastnumbers \
python39-fastnumbers(aarch-64) \
python3dist(fastnumbers)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
