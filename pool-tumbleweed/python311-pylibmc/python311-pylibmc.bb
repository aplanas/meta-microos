SUMMARY = "memcached client for Python"
DESCRIPTION = "pylibmc is a Python client for (lib)memcached written in C. \
The Python interface is similar to python-memcached. \
 \
pylibmc leverages configurable behaviors, data pickling, data \
compression, tested GIL retention, consistent distribution, and the \
binary memcached protocol."
LICENSE = "BSD-3-Clause"

PV = "1.6.3"

RPM_NAME = "python311-pylibmc-1.6.3-2.3.aarch64.rpm"
RPM_HASH = "21fd8182e087999fdc03a36e51bbfcfda3700b2b43270671706d0e6133c322d7b90084af8396d66d5ab7fa04cd6254f88458851aa651d82f1dc938c18fa259b0"

RPROVIDES:${PN} += "python3-pylibmc \
python3.11dist-pylibmc \
python311-pylibmc \
python3dist-pylibmc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmemcached.so.11 \
libz.so.1 \
python-abi"

inherit rpm
