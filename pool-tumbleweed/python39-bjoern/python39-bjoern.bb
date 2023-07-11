SUMMARY = "A screamingly fast Python 2 + 3 WSGI server written in C"
DESCRIPTION = "A screamingly fast Python 2 + 3 WSGI server written in C."
LICENSE = "BSD-2-Clause"

PV = "3.2.2"

RPM_NAME = "python39-bjoern-3.2.2-1.7.aarch64.rpm"
RPM_HASH = "6172ba2c72a616638b70f1302812efa1790a9e963be6e9c9a8ec52ccb099200bce73a1d0d0559790ae8cb4f1f0aa86576de9daa1ec3f93d56173d0cd32f74cde"

RPROVIDES:${PN} += "python3.9dist-bjoern \
python39-bjoern \
python3dist-bjoern"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libev.so.4 \
python-abi"

inherit rpm
