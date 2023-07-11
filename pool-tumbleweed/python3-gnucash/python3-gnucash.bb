SUMMARY = "Python bindings for GnuCash"
DESCRIPTION = "This package provides the Python 3 bindings for development of GnuCash, \
a personal finance manager."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception | SUSE-GPL-3.0-with-openssl-exception"

PV = "4.14"

RPM_NAME = "python3-gnucash-4.14-1.4.aarch64.rpm"
RPM_HASH = "23509d04bdbcb8e3975d671eb57a49e924efe17a39ece0697b35f1b0fd118260057271b034beace800d14394b9658274d52920f1d47929c57f692d4becc265aa"

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
