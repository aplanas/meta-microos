SUMMARY = "Debugging, in-system programming and boundary-scan testing for embedded devices"
DESCRIPTION = "The Open On-Chip Debugger (OpenOCD) provides debugging, in-system programming \
and boundary-scan testing for embedded devices.  Various different boards, \
targets, and interfaces are supported to ease development time. \
 \
Install OpenOCD if you are looking for an open source solution for hardware \
debugging."
LICENSE = "GPL-2.0-only"

PV = "0.12.0"

RPM_NAME = "openocd-0.12.0-2.3.aarch64.rpm"
RPM_HASH = "99127c985051cc05aa4ad2b5520ad5c38a9cd3cb9c2fe4e2baf00edb7ff651d22b89d3b9c6799d1e7ee6776e23a857761550e8d2ba1e0c8d03bec4eadd85ab2e"

RPROVIDES:${PN} += "openocd \
openocd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libftdi1.so.2()(64bit) \
libhidapi-hidraw.so.0()(64bit) \
libjaylink.so.0()(64bit) \
libjim.so.0.81()(64bit) \
libusb-1.0.so.0()(64bit) \
openocd-data \
udev"

inherit rpm
