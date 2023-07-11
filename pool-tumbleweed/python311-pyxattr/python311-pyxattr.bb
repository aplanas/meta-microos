SUMMARY = "Filesystem extended attributes for python"
DESCRIPTION = "This is a C extension module for Python which \
implements extended attributes manipulation. It is a wrapper on top \
of the attr C library - see attr(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "python311-pyxattr-0.7.2-1.15.aarch64.rpm"
RPM_HASH = "6a3f776326578d50907cf43dda889d2e26e93c9f27ae8e73df474ae91e8aa840d046e0659562b7eebf8f3dc771f2520326f0e93b051c6f9548d320677a32dc22"

RPROVIDES:${PN} += "python3-pyxattr \
python3.11dist-pyxattr \
python311-pyxattr \
python3dist-pyxattr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
