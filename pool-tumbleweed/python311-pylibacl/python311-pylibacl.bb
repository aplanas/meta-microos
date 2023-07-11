SUMMARY = "POSIX1e ACLs for python"
DESCRIPTION = "This is a C extension module for Python which \
implements POSIX ACLs manipulation. It is a wrapper on top \
of the systems's acl C library - see acl(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python311-pylibacl-0.6.0-1.10.aarch64.rpm"
RPM_HASH = "72083001fd99662ddb4d0aac739208800721fb53551677a5684b77c8e10aa103358a575c56355304406d0b445af76777e7b4bf640274035703bb4d093ce71373"

RPROVIDES:${PN} += "python3-pylibacl \
python3.11dist-pylibacl \
python311-pylibacl \
python3dist-pylibacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
python-abi"

inherit rpm
