SUMMARY = "Python bindings for samba clients (libsmbclient)"
DESCRIPTION = "This is a set of Python bindings for the libsmbclient library \
from the samba project."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.23"

RPM_NAME = "python310-pysmbc-1.0.23-3.10.aarch64.rpm"
RPM_HASH = "a105642c70138923990766dcfadd56062279f1c74b620120c4b6840ac9894289dc13c589b86031cd132da2247504f0ab37a5cd663045f1833fde8954483a3798"

RPROVIDES:${PN} += "python-smbc \
python3.10dist-pysmbc \
python310-pysmbc \
python310-smbc \
python3dist-pysmbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsmbclient.so.0 \
python-abi"

inherit rpm
