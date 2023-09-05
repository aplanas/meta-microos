SUMMARY = "POSIX1e ACLs for python"
DESCRIPTION = "This is a C extension module for Python which \
implements POSIX ACLs manipulation. It is a wrapper on top \
of the systems's acl C library - see acl(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python39-pylibacl-0.6.0-2.1.aarch64.rpm"
RPM_HASH = "2849af75bdc358155f480b99833f975c99c7479388966a36f03d3ac83b548fb70ba1b9d91872d18423fad9b25127b1c72a4b39cf0ebbb88186fd7ff7412e7d79"

RPROVIDES:${PN} += "python3.9dist-pylibacl \
python39-pylibacl \
python3dist-pylibacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
python-abi"

inherit rpm
