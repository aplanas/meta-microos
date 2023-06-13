SUMMARY = "Python bindings for samba clients (libsmbclient)"
DESCRIPTION = "This is a set of Python bindings for the libsmbclient library \
from the samba project."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.23"

RPM_NAME = "python311-pysmbc-1.0.23-3.8.aarch64.rpm"
RPM_HASH = "4b8ef276244002f8889a50d8a379ef780ab2533fd047d5b0df03ad90cfac41a9fdc6dfee6bdfd8dd7d1fb1b932138cda5b800b1d0facb94599e7dab02517b14a"

RPROVIDES:${PN} += "python-smbc \
python3.11dist(pysmbc) \
python311-pysmbc \
python311-pysmbc(aarch-64) \
python311-smbc \
python3dist(pysmbc)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsmbclient.so.0()(64bit) \
python(abi)"

inherit rpm
