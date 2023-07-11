SUMMARY = "Service granting access to the configuration options of gaming mice"
DESCRIPTION = "libratbag is a configuration library for gaming mice. It provides a \
generic way to access the various features exposed by these mice and \
abstracts away hardware-specific and kernel-specific quirks. \
 \
This subpackage contains the daemon managing access to the hardware. \
It enables any user that is a member of the group 'games' to configure \
supported mice via ratbagctl or Piper."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "ratbagd-0.17-2.2.aarch64.rpm"
RPM_HASH = "f75cc2eb37d403f48bccd26155e3248c98c1c91e02bde85b14233d62875801c68681719ed4f02e822946b0551400af658caeb6520d732625d2202d2cf6cea100"

RPROVIDES:${PN} += "ratbagd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-games \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libsystemd.so.0 \
libudev.so.1 \
libunistring.so.5"

inherit rpm
