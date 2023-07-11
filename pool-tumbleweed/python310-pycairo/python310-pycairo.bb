SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python310-pycairo-1.23.0-2.2.aarch64.rpm"
RPM_HASH = "433b6d8ccf079e2dc59da021e78c13d59a1bba61c1473d5f1c4796e31aab12bb0bff6867cf2c247a252f33a586ef8bf94682c352af85f3092895eeeda3ee728d"

RPROVIDES:${PN} += "python3.10dist-pycairo \
python310-cairo \
python310-pycairo \
python3dist-pycairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
python-abi"

inherit rpm
