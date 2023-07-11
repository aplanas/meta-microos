SUMMARY = "POSIX1e ACLs for python"
DESCRIPTION = "This is a C extension module for Python which \
implements POSIX ACLs manipulation. It is a wrapper on top \
of the systems's acl C library - see acl(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python310-pylibacl-0.6.0-1.10.aarch64.rpm"
RPM_HASH = "7e5450a6ed6910ee7039e22e246fd18d1a8f2d297ffe31acc55ec6e5e35c2b1c5b4d686b9d9b702abf0da8733902dab034648be50ac400c68dc1d5d49a2bd48a"

RPROVIDES:${PN} += "python3.10dist-pylibacl \
python310-pylibacl \
python3dist-pylibacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
python-abi"

inherit rpm
