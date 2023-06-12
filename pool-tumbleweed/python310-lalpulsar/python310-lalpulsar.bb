SUMMARY = "LSC Algorithm Pulsar Library"
DESCRIPTION = "The LSC Algorithm Pulsar Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "python310-lalpulsar-5.0.0-1.3.aarch64.rpm"
RPM_HASH = "0ea60449fff4bcca3fc2ad1583783b54e99e068f2a01987ab9a9853f17c2ad51bae524a616bbb911ccd15e59bf293572958b1370442b8565bedf5e80ec6d2bf6"

RPROVIDES:${PN} += "python3-lalpulsar \
python310-lalpulsar \
python310-lalpulsar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgsl.so.25()(64bit) \
liblal.so.20()(64bit) \
liblalpulsar.so.26()(64bit) \
liblalsupport.so.14()(64bit) \
python(abi) \
python310-lal \
python310-lalframe \
python310-lalinference \
python310-lalsimulation \
python310-numpy"

inherit rpm
