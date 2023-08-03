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

RPM_NAME = "python311-fastnumbers-5.0.1-1.1.aarch64.rpm"
RPM_HASH = "685d8c6171f280b6abca014c583cf9c18a667a084932c3a97be011feca22c85434c41481e5d1d716203f1a0389ea9bcb793fb89b4fe9eaabd2d12e077a43eb0c"

RPROVIDES:${PN} += "python3-fastnumbers \
python3.11dist-fastnumbers \
python311-fastnumbers \
python3dist-fastnumbers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
