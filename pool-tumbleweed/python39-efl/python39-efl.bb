SUMMARY = "Python bindings of evas"
DESCRIPTION = "Python bindings of the Enlightenment Foundation Libraries (efl)."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.25.0"

RPM_NAME = "python39-efl-1.25.0-2.6.aarch64.rpm"
RPM_HASH = "bbf3be2fa63d4a4d3bad98cf32221a2656734da0a174cb6b8e66466f71b56aae9625f6eb446cd8fabc2757d4d82403392bfaacfc6d84eeea027d77a7eeb0337a"

RPROVIDES:${PN} += "python3.9dist(python-efl) \
python39-efl \
python39-efl(aarch-64) \
python3dist(python-efl)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libecore.so.1()(64bit) \
libecore_con.so.1()(64bit) \
libecore_file.so.1()(64bit) \
libecore_input.so.1()(64bit) \
libecore_x.so.1()(64bit) \
libedje.so.1()(64bit) \
libeina.so.1()(64bit) \
libelementary.so.1()(64bit) \
libemotion.so.1()(64bit) \
libeo.so.1()(64bit) \
libethumb.so.1()(64bit) \
libethumb_client.so.1()(64bit) \
libevas.so.1()(64bit) \
python(abi)"

inherit rpm
