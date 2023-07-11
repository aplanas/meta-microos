SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.3"

RPM_NAME = "python39-pyfuse3-3.2.3-1.3.aarch64.rpm"
RPM_HASH = "2c7e4a03b46f6a48da484375437f51346a566701e5cb9d3426bc37fa40796dc67a35b13c3ae661da1f688c4f4574dbc506e1c570ae1b4b91d1b37807a00cc6fa"

RPROVIDES:${PN} += "python3.9dist-pyfuse3 \
python39-pyfuse3 \
python3dist-pyfuse3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
python-abi \
python39-trio"

inherit rpm
