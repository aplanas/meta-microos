SUMMARY = "Filesystem extended attributes for python"
DESCRIPTION = "This is a C extension module for Python which \
implements extended attributes manipulation. It is a wrapper on top \
of the attr C library - see attr(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "python310-pyxattr-0.7.2-1.15.aarch64.rpm"
RPM_HASH = "2264d9d7ad3e91442f475f25b691cdca1717c3e9f6419e52273fe3a03d76b40efb2732530fa0950b1b32e1589148b3351aeaa3764414ca9409140fdebd14f4b1"

RPROVIDES:${PN} += "python3.10dist-pyxattr \
python310-pyxattr \
python3dist-pyxattr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
