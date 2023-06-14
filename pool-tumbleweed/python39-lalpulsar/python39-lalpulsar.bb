SUMMARY = "LSC Algorithm Pulsar Library"
DESCRIPTION = "The LSC Algorithm Pulsar Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "python39-lalpulsar-5.0.0-1.3.aarch64.rpm"
RPM_HASH = "6432cf92bf6cd2f746b08ebaccb3b439d01381d634b14e86a36b862cdbd8013f1010aefe03616f76e24e1c74bd0268d144841a22a3c297b399727a28134c524f"

RPROVIDES:${PN} += "python39-lalpulsar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.25 \
liblal.so.20 \
liblalpulsar.so.26 \
liblalsupport.so.14 \
python-abi \
python39-lal \
python39-lalframe \
python39-lalinference \
python39-lalsimulation \
python39-numpy"

inherit rpm
