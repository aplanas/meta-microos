SUMMARY = "POSIX1e ACLs for python"
DESCRIPTION = "This is a C extension module for Python which \
implements POSIX ACLs manipulation. It is a wrapper on top \
of the systems's acl C library - see acl(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "python311-pylibacl-0.6.0-2.1.aarch64.rpm"
RPM_HASH = "b8eb352cc836f3fb8a9614f5fd68b305e8e944779ca29d144a2306d853657ae973a76acd8769c28a3560ba49ba9170ec5cae22941819d5f152e0c08f6b9374ec"

RPROVIDES:${PN} += "python3-pylibacl \
python3.11dist-pylibacl \
python311-pylibacl \
python3dist-pylibacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
python-abi"

inherit rpm
