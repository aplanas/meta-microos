SUMMARY = "Python bindings for GnuCash"
DESCRIPTION = "This package provides the Python 3 bindings for development of GnuCash, \
a personal finance manager."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "5.3"

RPM_NAME = "python3-gnucash-5.3-1.1.aarch64.rpm"
RPM_HASH = "663f592d15d817b0dc08b068617026d91c38cc6e3e7d4bc6f2fd88fb2ded0b0c64fec9442af66faf6a9e22a89538107a4df05c2d6446a3c09b0003ee108eca22"

RPROVIDES:${PN} += "python3-gnucash"

RDEPENDS:${PN} += "gnucash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnc-app-utils.so \
libgnc-core-utils.so \
libgnc-engine.so \
libgobject-2.0.so.0 \
libpython3.11.so.1.0 \
python-abi"

inherit rpm
