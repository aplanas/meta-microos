SUMMARY = "Python bindings for samba clients (libsmbclient)"
DESCRIPTION = "This is a set of Python bindings for the libsmbclient library \
from the samba project."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.23"

RPM_NAME = "python39-pysmbc-1.0.23-3.10.aarch64.rpm"
RPM_HASH = "e163e34e4f69a864f45ae7543c65839d77bf51baacedd81f34bb6c099ffac8cc440ef0a511034eecc42a6c3c79d85f6f143e476d9d382942752b531977624de4"

RPROVIDES:${PN} += "python-smbc \
python3.9dist-pysmbc \
python39-pysmbc \
python39-smbc \
python3dist-pysmbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsmbclient.so.0 \
python-abi"

inherit rpm
