SUMMARY = "memcached client for Python"
DESCRIPTION = "pylibmc is a Python client for (lib)memcached written in C. \
The Python interface is similar to python-memcached. \
 \
pylibmc leverages configurable behaviors, data pickling, data \
compression, tested GIL retention, consistent distribution, and the \
binary memcached protocol."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "python39-pylibmc-1.6.3-2.1.aarch64.rpm"
RPM_HASH = "06144776082d978c658c3befb4b40f047e351c65b005e8338cb32101216cc1bdeae7340ca29e74547811392f91def278cb6e715e6096701b494d696fa95aa372"

RPROVIDES:${PN} += "python3.9dist(pylibmc) \
python39-pylibmc \
python39-pylibmc(aarch-64) \
python3dist(pylibmc)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmemcached.so.11()(64bit) \
libz.so.1()(64bit) \
python(abi)"

inherit rpm
