SUMMARY = "POSIX1e ACLs for python"
DESCRIPTION = "This is a C extension module for Python which \
implements POSIX ACLs manipulation. It is a wrapper on top \
of the systems's acl C library - see acl(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python39-pylibacl-0.6.0-1.10.aarch64.rpm"
RPM_HASH = "c69feb47aca969f9f4ebc2a8f14b3ab5e6e9e3c65233ff261f335af560a5dd11cfbd4a8389ebb72393cc4722d177e6e9114e651523d34b4ffb193b1d1ada28a8"

RPROVIDES:${PN} += "python3.9dist-pylibacl \
python39-pylibacl \
python3dist-pylibacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
python-abi"

inherit rpm
