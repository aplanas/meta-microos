SUMMARY = "Filesystem extended attributes for python"
DESCRIPTION = "This is a C extension module for Python which \
implements extended attributes manipulation. It is a wrapper on top \
of the attr C library - see attr(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "python311-pyxattr-0.7.2-2.1.aarch64.rpm"
RPM_HASH = "6483b65828975791bb8677cfe72174f3e2860d37bc765ab158b8e77524bc29e10f82241c1c3559094cec5ae254806a3eda0325e9c7b882a24ae9248f079e113d"

RPROVIDES:${PN} += "python3-pyxattr \
python3.11dist-pyxattr \
python311-pyxattr \
python3dist-pyxattr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
