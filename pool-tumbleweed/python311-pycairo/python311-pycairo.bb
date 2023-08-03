SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.24.0"

RPM_NAME = "python311-pycairo-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "9ebb4263c1de7adf573432211091b79e385b56947255285b35ae2daf1383c109acd7132a874bedf706f86e086f94b056440a6ff85c4ea6db7f15989264093962"

RPROVIDES:${PN} += "python3-cairo \
python3-pycairo \
python3.11dist-pycairo \
python311-cairo \
python311-pycairo \
python3dist-pycairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
python-abi"

inherit rpm
