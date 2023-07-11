SUMMARY = "Python bindings for samba clients (libsmbclient)"
DESCRIPTION = "This is a set of Python bindings for the libsmbclient library \
from the samba project."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.23"

RPM_NAME = "python311-pysmbc-1.0.23-3.10.aarch64.rpm"
RPM_HASH = "640775119a344993803dd67dc3e44a38f64b59b60a6af48cb344c48280d9179d24e9b03152bd80f01b9187e6568aa0f8d332116f5d83df4748414d3b09c1b81b"

RPROVIDES:${PN} += "python-smbc \
python3-pysmbc \
python3-smbc \
python3.11dist-pysmbc \
python311-pysmbc \
python311-smbc \
python3dist-pysmbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsmbclient.so.0 \
python-abi"

inherit rpm
