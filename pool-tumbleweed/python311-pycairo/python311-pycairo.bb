SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.23.0"

RPM_NAME = "python311-pycairo-1.23.0-2.2.aarch64.rpm"
RPM_HASH = "faa00d923ef444bc4c3129cddbc96ed7a8f8d29f9d8454d487bd6864c285edc7d6aae3c750df858bdce470ab08e7fa01358099c65c107cbb2ff5ea4d0bc1da1a"

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
