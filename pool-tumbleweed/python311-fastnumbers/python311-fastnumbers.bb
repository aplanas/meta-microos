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

RPM_NAME = "python311-fastnumbers-3.2.1-1.9.aarch64.rpm"
RPM_HASH = "b746b302bd9dc461289b30d11cb0f719af27d689e84ff71b37fa9b1106f98c0485e97c507a2eea1446ecec769b7fcc904b9a200446bbfd0b44b6df399d7af1e1"

RPROVIDES:${PN} += "python3-fastnumbers \
python3.11dist-fastnumbers \
python311-fastnumbers \
python3dist-fastnumbers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
