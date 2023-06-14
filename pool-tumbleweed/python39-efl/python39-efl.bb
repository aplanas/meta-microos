SUMMARY = "Python bindings of evas"
DESCRIPTION = "Python bindings of the Enlightenment Foundation Libraries (efl)."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.25.0"

RPM_NAME = "python39-efl-1.25.0-2.6.aarch64.rpm"
RPM_HASH = "bbf3be2fa63d4a4d3bad98cf32221a2656734da0a174cb6b8e66466f71b56aae9625f6eb446cd8fabc2757d4d82403392bfaacfc6d84eeea027d77a7eeb0337a"

RPROVIDES:${PN} += "python3.9dist-python-efl \
python39-efl \
python3dist-python-efl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libecore-con.so.1 \
libecore-file.so.1 \
libecore-input.so.1 \
libecore-x.so.1 \
libecore.so.1 \
libedje.so.1 \
libeina.so.1 \
libelementary.so.1 \
libemotion.so.1 \
libeo.so.1 \
libethumb-client.so.1 \
libethumb.so.1 \
libevas.so.1 \
python-abi"

inherit rpm
