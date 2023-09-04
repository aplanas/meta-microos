SUMMARY = "Filesystem extended attributes for python"
DESCRIPTION = "This is a C extension module for Python which \
implements extended attributes manipulation. It is a wrapper on top \
of the attr C library - see attr(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "python310-pyxattr-0.7.2-2.1.aarch64.rpm"
RPM_HASH = "91940984942c19d62b3cc5cfad4691ecb142e8ccacda39f399f7f05ba7bd61723243d3b45d5710d309a759de8aecc3136a45b1a4dd4d24f9f0b9b0b5440e51eb"

RPROVIDES:${PN} += "python3.10dist-pyxattr \
python310-pyxattr \
python3dist-pyxattr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
