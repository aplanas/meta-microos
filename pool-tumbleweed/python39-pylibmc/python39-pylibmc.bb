SUMMARY = "memcached client for Python"
DESCRIPTION = "pylibmc is a Python client for (lib)memcached written in C. \
The Python interface is similar to python-memcached. \
 \
pylibmc leverages configurable behaviors, data pickling, data \
compression, tested GIL retention, consistent distribution, and the \
binary memcached protocol."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "python39-pylibmc-1.6.3-2.3.aarch64.rpm"
RPM_HASH = "06df44a1d8892886dbb3ad021b70197d9202b1ef2ec01245128708a811e6f13569bc0edf2ecd073f5d4bea937bee1af3ba6c385ddeb2608a6d1ac39891868c74"

RPROVIDES:${PN} += "python3.9dist-pylibmc \
python39-pylibmc \
python3dist-pylibmc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmemcached.so.11 \
libz.so.1 \
python-abi"

inherit rpm
