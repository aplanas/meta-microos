SUMMARY = "Dynamic library to access udev device information"
DESCRIPTION = "This package contains the dynamic library libudev, which provides \
access to udev device information"
LICENSE = "LGPL-2.1-or-later"

PV = "253.5"

RPM_NAME = "libudev1-253.5-5.1.aarch64.rpm"
RPM_HASH = "779a79e6513d7e9877f3ce856c60e73afdf6f60035bc160922f97dd13e5a634e8c6592dd4c3733c10a09781956707c15818dca59701af819d510b4e15f10137c"

RPROVIDES:${PN} += "libudev.so.1 \
libudev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2"

inherit rpm
