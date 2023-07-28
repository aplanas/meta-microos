SUMMARY = "Dynamic library to access udev device information"
DESCRIPTION = "This package contains the dynamic library libudev, which provides \
access to udev device information"
LICENSE = "LGPL-2.1-or-later"

PV = "253.7"

RPM_NAME = "libudev1-253.7-1.2.aarch64.rpm"
RPM_HASH = "bc082c01ce60c53d98bfb8a573d2681aac4b1ec343c17218fa6813deb1d879c9f2a4be598825b3b3e00720e17441e1d151c8c758bc0e5e1575922f71bfc15625"

RPROVIDES:${PN} += "libudev.so.1 \
libudev1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2"

inherit rpm
