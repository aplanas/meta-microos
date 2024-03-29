SUMMARY = "Online validation of Yubikey OTPs"
DESCRIPTION = "This project implements online validation of Yubikey OTPs. \
It is written in C and provides a shared library for use by other software."
LICENSE = "BSD-2-Clause"

PV = "2.15"

RPM_NAME = "libykclient3-2.15-1.27.aarch64.rpm"
RPM_HASH = "e99756dbba11a056237ccdfe5396ae82fe6ad3a7e2a0687de00ff8d0b44017137543fce2cf50830efa026541981842b4589245d09d0ca3153bab33990bcb0f83"

RPROVIDES:${PN} += "libykclient.so.3 \
libykclient3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4"

inherit rpm
