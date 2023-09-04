SUMMARY = "Debugging, in-system programming and boundary-scan testing for embedded devices"
DESCRIPTION = "The Open On-Chip Debugger (OpenOCD) provides debugging, in-system programming \
and boundary-scan testing for embedded devices.  Various different boards, \
targets, and interfaces are supported to ease development time. \
 \
Install OpenOCD if you are looking for an open source solution for hardware \
debugging."
LICENSE = "GPL-2.0-only"

PV = "0.12.0"

RPM_NAME = "openocd-0.12.0-2.5.aarch64.rpm"
RPM_HASH = "b20d09b2103a514b6cd1c08404fe6fe923d2b8a988a8d6e233247eefa967ff166e2678b61d3e919460f5345f140a93ad50f382f642e09c5c928e1f25a003bf67"

RPROVIDES:${PN} += "openocd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
libhidapi-hidraw.so.0 \
libjaylink.so.0 \
libjim.so.0.82 \
libusb-1.0.so.0 \
openocd-data \
udev"

inherit rpm
