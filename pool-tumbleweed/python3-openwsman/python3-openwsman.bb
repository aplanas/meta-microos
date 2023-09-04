SUMMARY = "Python3 bindings for OpenWSMAN client API"
DESCRIPTION = "This package provides Python3 bindings to access the OpenWSMAN client \
API."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "python3-openwsman-2.7.2-2.9.aarch64.rpm"
RPM_HASH = "ebf7ea803e5fe1bb7f55bc4eda2d37cbd4f286aeb73fd86e19785a1baa5e3ebd41f0729d5af218c242c258d1066b7c0ec7ff5a3769ad0aba15a7c62e731cac68"

RPROVIDES:${PN} += "openwsman-python \
python3-openwsman"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwsman-client.so.5 \
libwsman-curl-client-transport.so.1 \
libwsman.so.1 \
python-abi \
python3"

inherit rpm
