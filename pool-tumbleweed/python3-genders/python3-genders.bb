SUMMARY = "Python bindings for genders"
DESCRIPTION = "Necessary files for using genders with Python."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.1"

RPM_NAME = "python3-genders-1.28.1-2.5.aarch64.rpm"
RPM_HASH = "41fe79080c8a55fc40a579b2e061f95ad1b670685876f904b6f13317b2c7e064b291dd9dc5320535900a49a710df206c48006072eb6fe180e3e687cb3cdcc10a"

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
