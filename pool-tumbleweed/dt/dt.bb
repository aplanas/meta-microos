SUMMARY = "Generic data test program"
DESCRIPTION = "dt is a generic data test program used to verify proper operation of \
peripherals, file systems, device drivers, or any data stream supported \
by the operating system.  In its simplest mode of operation, dt writes \
and then verifys its default data pattern, then displays performance \
statisics and other test parameters before exiting.  Since verification \
of data is performed, dt can be thought of as a generic diagnostic tool."
LICENSE = "MIT"

PV = "23.28"

RPM_NAME = "dt-23.28-1.10.aarch64.rpm"
RPM_HASH = "f0a193e37cb7449448bfc9890991c8837b840f0489af7e3a8262354f24c3554f71914ac55cf984dfc6c5af6dd8224ba7e932a32576a1176b6aa0cb002c83b125"

RPROVIDES:${PN} += "dt"

RDEPENDS:${PN} += "/usr/bin/csh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
