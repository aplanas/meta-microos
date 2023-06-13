SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python310-pycairo-1.23.0-2.1.aarch64.rpm"
RPM_HASH = "a457ef2a2ead61387acd1d322bbfa788bf940d1218a3eaa3f23530b5c98b16d4b0718c34991ad3d42be359f81cd38f1d4bfc69b71d33cd259511205b6345d5c1"

RPROVIDES:${PN} += "python3-cairo \
python3-pycairo \
python3.10dist(pycairo) \
python310-cairo \
python310-pycairo \
python310-pycairo(aarch-64) \
python3dist(pycairo)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
python(abi)"

inherit rpm
