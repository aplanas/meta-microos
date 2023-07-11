SUMMARY = "memcached client for Python"
DESCRIPTION = "pylibmc is a Python client for (lib)memcached written in C. \
The Python interface is similar to python-memcached. \
 \
pylibmc leverages configurable behaviors, data pickling, data \
compression, tested GIL retention, consistent distribution, and the \
binary memcached protocol."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "python310-pylibmc-1.6.3-2.3.aarch64.rpm"
RPM_HASH = "a3efdb41bf5df75019bbb9578c15428374c833d831b1569cd05f1505e19dcc3e2384ff2fcbccfb2b5ea2f5d1b273814926f30494c99560dc30d4ad93ea1192a7"

RPROVIDES:${PN} += "python3.10dist-pylibmc \
python310-pylibmc \
python3dist-pylibmc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmemcached.so.11 \
libz.so.1 \
python-abi"

inherit rpm
