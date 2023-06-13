SUMMARY = "Online validation of Yubikey OTPs"
DESCRIPTION = "This project implements online validation of Yubikey OTPs. \
It is written in C and provides a shared library for use by other software."
LICENSE = "BSD-2-Clause"

PV = "2.15"

RPM_NAME = "ykclient-2.15-1.27.aarch64.rpm"
RPM_HASH = "9b9251cbbce33ae3a39a3725b2f7fc4eae3e7a3c4a1403afa3a542fc69bae17064ea2b64772d8131e49549a077588cafbee66b72771858dc2c07af2173ae821e"

RPROVIDES:${PN} += "ykclient \
ykclient(aarch-64) \
yubico-c-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libykclient.so.3()(64bit) \
libykclient.so.3(Base)(64bit) \
libykclient.so.3(YKCLIENT_2.12)(64bit) \
libykclient.so.3(YKCLIENT_2.15)(64bit) \
libykclient3"

inherit rpm
