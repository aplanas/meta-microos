SUMMARY = "Debugging, in-system programming and boundary-scan testing for embedded devices"
DESCRIPTION = "The Open On-Chip Debugger (OpenOCD) provides debugging, in-system programming \
and boundary-scan testing for embedded devices.  Various different boards, \
targets, and interfaces are supported to ease development time. \
 \
Install OpenOCD if you are looking for an open source solution for hardware \
debugging."
LICENSE = "GPL-2.0-only"

PV = "0.12.0"

RPM_NAME = "openocd-0.12.0-2.4.aarch64.rpm"
RPM_HASH = "fc2646f8a106c2431e17ece525fe59ddbefa624379441de2000911e3e6445aaf99e51669d26481889cdf635ab4c1cd1feb9f24aabd7ad7eda70e96ab1efde72b"

RPROVIDES:${PN} += "openocd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
libhidapi-hidraw.so.0 \
libjaylink.so.0 \
libjim.so.0.81 \
libusb-1.0.so.0 \
openocd-data \
udev"

inherit rpm
