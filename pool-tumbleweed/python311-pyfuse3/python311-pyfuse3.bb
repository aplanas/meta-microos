SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.3"

RPM_NAME = "python311-pyfuse3-3.2.3-1.3.aarch64.rpm"
RPM_HASH = "71e02984914f6eb8735569720e8d01dcda6918ead846133c3807e51f2f9f9b180c1fb3c8dc96edf9513fa0d157ca81751167e57a1a18d06a6ab16ee921c7139e"

RPROVIDES:${PN} += "python3-pyfuse3 \
python3.11dist-pyfuse3 \
python311-pyfuse3 \
python3dist-pyfuse3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.3 \
python-abi \
python311-trio"

inherit rpm
