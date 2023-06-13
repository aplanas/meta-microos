SUMMARY = "Python bindings for samba clients (libsmbclient)"
DESCRIPTION = "This is a set of Python bindings for the libsmbclient library \
from the samba project."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.23"

RPM_NAME = "python310-pysmbc-1.0.23-3.8.aarch64.rpm"
RPM_HASH = "a353c85373a6e953ed9b91fd5741aa7903bd2141e797141980be03bde95e224037034c3ec433177b8816cd6137052db44493b3dba05bc0e49aba2d6db4a945f2"

RPROVIDES:${PN} += "python-smbc \
python3-pysmbc \
python3-smbc \
python3.10dist(pysmbc) \
python310-pysmbc \
python310-pysmbc(aarch-64) \
python310-smbc \
python3dist(pysmbc)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsmbclient.so.0()(64bit) \
python(abi)"

inherit rpm
