SUMMARY = "Python bindings for GnuCash"
DESCRIPTION = "This package provides the Python 3 bindings for development of GnuCash, \
a personal finance manager."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "4.14"

RPM_NAME = "python3-gnucash-4.14-1.3.aarch64.rpm"
RPM_HASH = "a1b44c0032a2abe256c3ae5f8cbef4f70a7cad0fbd15c80ea4c88825590e0dc9643c06c2aeb5609a68167e3ebb2521383633b51097f791f069f121402b31f05b"

RPROVIDES:${PN} += "python3-gnucash"

RDEPENDS:${PN} += "gnucash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnc-app-utils.so \
libgnc-core-utils.so \
libgnc-engine.so \
libgobject-2.0.so.0 \
libpython3.10.so.1.0 \
python-abi"

inherit rpm
