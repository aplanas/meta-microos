SUMMARY = "LSC Algorithm Pulsar Library"
DESCRIPTION = "The LSC Algorithm Pulsar Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0"

RPM_NAME = "python38-lalpulsar-5.0.0-1.3.aarch64.rpm"
RPM_HASH = "2348d2a2dda7bd3bb59a29dd8f73155d3e4ed34d4cc94b878789f4875ecee94566a0d62075ba5aae9c465d0390668b780c38abb30d98f1119ebbdce0d4147dfd"

RPROVIDES:${PN} += "python38-lalpulsar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.25 \
liblal.so.20 \
liblalpulsar.so.26 \
liblalsupport.so.14 \
python-abi \
python38-lal \
python38-lalframe \
python38-lalinference \
python38-lalsimulation \
python38-numpy"

inherit rpm
