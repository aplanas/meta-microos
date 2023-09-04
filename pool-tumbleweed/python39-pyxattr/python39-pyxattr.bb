SUMMARY = "Filesystem extended attributes for python"
DESCRIPTION = "This is a C extension module for Python which \
implements extended attributes manipulation. It is a wrapper on top \
of the attr C library - see attr(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "python39-pyxattr-0.7.2-2.1.aarch64.rpm"
RPM_HASH = "47cbbf4a5d9a6ee5ee2146edac1febf55122bb3c299fe7dcd33b4ac4dcf1e6ba80f1613aaead25b46632285fae9188cd9f3995c994cc678401cce14b6f346418"

RPROVIDES:${PN} += "python3.9dist-pyxattr \
python39-pyxattr \
python3dist-pyxattr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
