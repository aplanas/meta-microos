SUMMARY = "memcached client for Python"
DESCRIPTION = "pylibmc is a Python client for (lib)memcached written in C. \
The Python interface is similar to python-memcached. \
 \
pylibmc leverages configurable behaviors, data pickling, data \
compression, tested GIL retention, consistent distribution, and the \
binary memcached protocol."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "python310-pylibmc-1.6.3-2.1.aarch64.rpm"
RPM_HASH = "b86fa727ba74a621ba77e44ccf2d5d8d81f15abc680715c42f2cb29dd20ed33e26f4ffd5e837ad036cab4cc701aaf6f3756c7065106cfe8dff231327c80621d6"

RPROVIDES:${PN} += "python3-pylibmc \
python3.10dist-pylibmc \
python310-pylibmc \
python3dist-pylibmc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmemcached.so.11 \
libz.so.1 \
python-abi"

inherit rpm
