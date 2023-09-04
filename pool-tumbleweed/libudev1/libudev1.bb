SUMMARY = "Dynamic library to access udev device information"
DESCRIPTION = "This package contains the dynamic library libudev, which provides \
access to udev device information"
LICENSE = "LGPL-2.1-or-later"

PV = "253.8"

RPM_NAME = "libudev1-253.8-1.2.aarch64.rpm"
RPM_HASH = "ed3786586d49af557425a031e0f594c30356bbfd8c6ceee0d79771dfc6e1d3f3d91c5af668967e2ccaf08e807778a33132300a08cd2be42d58fb8c3b3bbc5dac"

RPROVIDES:${PN} += "libudev.so.1 \
libudev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2"

inherit rpm
