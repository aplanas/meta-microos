SUMMARY = "memcached client for Python"
DESCRIPTION = "pylibmc is a Python client for (lib)memcached written in C. \
The Python interface is similar to python-memcached. \
 \
pylibmc leverages configurable behaviors, data pickling, data \
compression, tested GIL retention, consistent distribution, and the \
binary memcached protocol."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "python311-pylibmc-1.6.3-2.1.aarch64.rpm"
RPM_HASH = "e7d94e816884f8583476f926a19364284eb2d2822fa298cec05f36a61aecbfd06959941517018eaa393442926b6453887683b72699d047cb3cb4e61f5181d01a"

RPROVIDES:${PN} += "python3.11dist(pylibmc) \
python311-pylibmc \
python311-pylibmc(aarch-64) \
python3dist(pylibmc)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmemcached.so.11()(64bit) \
libz.so.1()(64bit) \
python(abi)"

inherit rpm
