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

RPM_NAME = "ratbagd-0.17-2.1.aarch64.rpm"
RPM_HASH = "798a163536d5ce789fd173ec2446be436f2c9652578c02ee2807edf8a6d3d48cf296e5abde27862de71d29304bde551637f1d52d5d71d79906d03e2048ef1152"

RPROVIDES:${PN} += "ratbagd \
ratbagd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
group(games) \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_222)(64bit) \
libsystemd.so.0(LIBSYSTEMD_227)(64bit) \
libsystemd.so.0(LIBSYSTEMD_243)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libunistring.so.5()(64bit)"

inherit rpm
