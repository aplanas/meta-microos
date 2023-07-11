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

RPM_NAME = "python310-fastnumbers-3.2.1-1.9.aarch64.rpm"
RPM_HASH = "bf1d98f587f7b6a06abf8f99925cd045858af1ca54272315bafd06e21cc9c07ae9c38cbc36dab85888f06af15634e17ba94a064af85e7cc0f5674aa98dd00858"

RPROVIDES:${PN} += "python3.10dist-fastnumbers \
python310-fastnumbers \
python3dist-fastnumbers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
