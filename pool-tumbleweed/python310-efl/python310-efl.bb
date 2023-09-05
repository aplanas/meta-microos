SUMMARY = "Python bindings of evas"
DESCRIPTION = "Python bindings of the Enlightenment Foundation Libraries (efl)."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.26.0"

RPM_NAME = "python310-efl-1.26.0-2.1.aarch64.rpm"
RPM_HASH = "2cefd7cb4b752f9956f517315b6335db8bcf28bf0c6ef45d841e8a9db7bd9e3511e2e9f48bdef322456f98af9e28c0c1184a80a2f53ce44b1702b76b14504c42"

RPROVIDES:${PN} += "python3.10dist-python-efl \
python310-efl \
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
