SUMMARY = "Online validation of Yubikey OTPs"
DESCRIPTION = "This project implements online validation of Yubikey OTPs. \
It is written in C and provides a shared library for use by other software."
LICENSE = "BSD-2-Clause"

PV = "2.15"

RPM_NAME = "ykclient-2.15-1.27.aarch64.rpm"
RPM_HASH = "9b9251cbbce33ae3a39a3725b2f7fc4eae3e7a3c4a1403afa3a542fc69bae17064ea2b64772d8131e49549a077588cafbee66b72771858dc2c07af2173ae821e"

RPROVIDES:${PN} += "ykclient \
yubico-c-client"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libykclient.so.3 \
libykclient3"

inherit rpm
