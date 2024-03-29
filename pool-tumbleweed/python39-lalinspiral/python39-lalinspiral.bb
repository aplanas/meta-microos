SUMMARY = "LSC Algorithm Inspiral Library"
DESCRIPTION = "The LSC Algorithm Inspiral Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.0"

RPM_NAME = "python39-lalinspiral-3.0.0-1.2.aarch64.rpm"
RPM_HASH = "0edbbfd6b057da58b12024be92e26b7b72d86fb20812afad9c0e873ea89757c17f041137852d6e9175ff84ebb23a71e274c2112790f7891513cd7d62fe974535"

RPROVIDES:${PN} += "python39-lalinspiral"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalinspiral.so.17 \
liblalsupport.so.14 \
libm.so.6 \
python-abi \
python39-glue \
python39-lal \
python39-lalburst \
python39-lalframe \
python39-lalmetaio \
python39-lalsimulation \
python39-numpy"

inherit rpm
