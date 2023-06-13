SUMMARY = "POSIX1e ACLs for python"
DESCRIPTION = "This is a C extension module for Python which \
implements POSIX ACLs manipulation. It is a wrapper on top \
of the systems's acl C library - see acl(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python311-pylibacl-0.6.0-1.8.aarch64.rpm"
RPM_HASH = "5f95c67b7dcce9ca2e8a92d15fef8dc6d92a3634e8fb1a3bf89130923f78503fa72ed9d166849e21b6c6a6aae8d86f9b20f871f789a5533b8c4725779f4cb07e"

RPROVIDES:${PN} += "python3.11dist(pylibacl) \
python311-pylibacl \
python311-pylibacl(aarch-64) \
python3dist(pylibacl)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
