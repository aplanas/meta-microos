SUMMARY = "Wireless setup and cryptography library"
DESCRIPTION = "The 'Embedded Linux Library' implements an API for wireless \
cryptography actions by using the kernel crypto API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.58"

RPM_NAME = "libell0-0.58-1.1.aarch64.rpm"
RPM_HASH = "e403f9598e781869b44deac1aab33117fe8e2c16d7b3e6ff6ead6c40fead599b21b082666b726bdee5e291a36a50a122f566571eeb14fca6263ef66b045f5a07"

RPROVIDES:${PN} += "libell.so.0 \
libell0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
