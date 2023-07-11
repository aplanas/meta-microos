SUMMARY = "Python 3 bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "python3-Hamlib-4.5.5-2.2.aarch64.rpm"
RPM_HASH = "9da9bcfd97db778cb45922a9e9563181befc468126510bde3580a48aea8216d363b72a3f8edd929dc9b46400e84d617a4f05809c2c6bceddd2550d91ebad756e"

RPROVIDES:${PN} += "python3-Hamlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhamlib.so.4 \
libpython3.11.so.1.0 \
python-abi"

inherit rpm
