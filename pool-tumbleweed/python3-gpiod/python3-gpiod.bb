SUMMARY = "Python binding for libgpiod"
DESCRIPTION = "The libgpiod library encapsulates the ioctl calls and data structures \
of the GPIO character devices, the latter of which superseded the \
GPIO sysfs interface in Linux 4.8. \
 \
Python binding part."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.3"

RPM_NAME = "python3-gpiod-1.6.3-2.4.aarch64.rpm"
RPM_HASH = "ea6dbe85adf77da33a0ffaf4257c3f4dd4120c0843f8c4115d13e14b42c720fa90f4029740f025241355e268a9babceaaeeed3f75164a2964119f926dc3e4eac"

RPROVIDES:${PN} += "python-libgpiod \
python3-gpiod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpiod.so.2 \
libgpiomockup.so.0 \
python-abi"

inherit rpm
