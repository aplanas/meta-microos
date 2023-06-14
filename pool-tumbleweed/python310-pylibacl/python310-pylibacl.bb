SUMMARY = "POSIX1e ACLs for python"
DESCRIPTION = "This is a C extension module for Python which \
implements POSIX ACLs manipulation. It is a wrapper on top \
of the systems's acl C library - see acl(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python310-pylibacl-0.6.0-1.8.aarch64.rpm"
RPM_HASH = "72b1ed97016c294442df5d8da4659f08ccf70fe5bb16b0479dc7a94473f711ded3dec6caf71681fb1655464ba3594e8e00652d216f2763e53fbfa04acad66e5d"

RPROVIDES:${PN} += "python3-pylibacl \
python3.10dist-pylibacl \
python310-pylibacl \
python3dist-pylibacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
python-abi"

inherit rpm
