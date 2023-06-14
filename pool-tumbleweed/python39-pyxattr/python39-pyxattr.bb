SUMMARY = "Filesystem extended attributes for python"
DESCRIPTION = "This is a C extension module for Python which \
implements extended attributes manipulation. It is a wrapper on top \
of the attr C library - see attr(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "python39-pyxattr-0.7.2-1.13.aarch64.rpm"
RPM_HASH = "405910f92783f0a034b7e4fffc5a973d62de6b713d7482d74f1166dbd358d5d387203d0c01494a8b4220546eb47c58f2777b02d37373e9d6f18068787a1c23d8"

RPROVIDES:${PN} += "python3.9dist-pyxattr \
python39-pyxattr \
python3dist-pyxattr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
