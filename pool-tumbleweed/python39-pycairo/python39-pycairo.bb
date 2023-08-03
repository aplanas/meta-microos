SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.24.0"

RPM_NAME = "python39-pycairo-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "a973fd9729fa17bc0b02346c4b59d7a97a6c75845968375665833e36c2bae6701ca58a77dba6f476c36a35c63bc1ea88b5ed363b4486194c1bef5cebdfbc8431"

RPROVIDES:${PN} += "python3.9dist-pycairo \
python39-cairo \
python39-pycairo \
python3dist-pycairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
python-abi"

inherit rpm
