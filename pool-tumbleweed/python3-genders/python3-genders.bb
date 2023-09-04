SUMMARY = "Python bindings for genders"
DESCRIPTION = "Necessary files for using genders with Python."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "python3-genders-1.28.1-2.6.aarch64.rpm"
RPM_HASH = "15d57a329ba32b86851185d7d87c2a9131117596866ebb3f12d43e6251383af66fc311c8bfe3c23108d4933f98c41de06084f4ff63ac0ea6f413f3af0b5124f7"

RPROVIDES:${PN} += "libgenders.cpython-311-aarch64-linux-gnu.so \
python3-genders \
python3.11dist-libgenders \
python3dist-libgenders"

RDEPENDS:${PN} += "genders \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenders.so.0 \
python-abi"

inherit rpm
