SUMMARY = "Generic data test program"
DESCRIPTION = "dt is a generic data test program used to verify proper operation of \
peripherals, file systems, device drivers, or any data stream supported \
by the operating system.  In its simplest mode of operation, dt writes \
and then verifys its default data pattern, then displays performance \
statisics and other test parameters before exiting.  Since verification \
of data is performed, dt can be thought of as a generic diagnostic tool."
LICENSE = "MIT"

PV = "23.28"

RPM_NAME = "dt-23.28-1.9.aarch64.rpm"
RPM_HASH = "7f7b8f65235eea2e76401d0486debde310f2b1f11f6674fe6a181219dff38340e41eb9d35cb71025d1410a261fbef26a5dad91cfb3559faed36a36294c7bf2d1"

RPROVIDES:${PN} += "dt"

RDEPENDS:${PN} += "/usr/bin/csh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
