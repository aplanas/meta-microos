SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.24.0"

RPM_NAME = "python310-pycairo-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "538ad89d1c97b889115787fc107b65e0140c39cca5342b4d82c8e2d6c6bf55bdb0b1b2fa04aaf1550b71ad35c143486fa71eead01c723130119d319b3d2bd491"

RPROVIDES:${PN} += "python3.10dist-pycairo \
python310-cairo \
python310-pycairo \
python3dist-pycairo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
python-abi"

inherit rpm
