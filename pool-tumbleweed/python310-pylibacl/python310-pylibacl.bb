SUMMARY = "POSIX1e ACLs for python"
DESCRIPTION = "This is a C extension module for Python which \
implements POSIX ACLs manipulation. It is a wrapper on top \
of the systems's acl C library - see acl(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python310-pylibacl-0.6.0-2.1.aarch64.rpm"
RPM_HASH = "4ded0a5c21de6235269111d8511fbb81e0bf757aa8b8bcc563271c15f6121392bd98ed589aa256013e4ca615ff2e323056a7d0fa1e56c702ad5fe35b233b9a2f"

RPROVIDES:${PN} += "python3.10dist-pylibacl \
python310-pylibacl \
python3dist-pylibacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
python-abi"

inherit rpm
