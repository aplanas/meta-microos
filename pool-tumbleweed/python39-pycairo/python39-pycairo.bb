SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python39-pycairo-1.23.0-2.1.aarch64.rpm"
RPM_HASH = "a05e1b86828723cbd2e5c45928df5f4d5519303c8162d292e00fadde1778f800e1d26b054f7b355aa395ccbb6fb99787ef46d02ab4e9d07fc8b4d8f0c51f2413"

RPROVIDES:${PN} += "python3.9dist(pycairo) \
python39-cairo \
python39-pycairo \
python39-pycairo(aarch-64) \
python3dist(pycairo)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
python(abi)"

inherit rpm
