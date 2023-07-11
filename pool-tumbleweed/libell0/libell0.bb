SUMMARY = "Wireless setup and cryptography library"
DESCRIPTION = "The 'Embedded Linux Library' implements an API for wireless \
cryptography actions by using the kernel crypto API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.57"

RPM_NAME = "libell0-0.57-1.1.aarch64.rpm"
RPM_HASH = "4968d19efbe505755a387361eeab64225ef622ff513d01dc1585dd6d9f638a99e8472a9a2df6de7608fec763977ce76fec09f6e9c4b7ac286af4ad6aeb158fb7"

RPROVIDES:${PN} += "libell.so.0 \
libell0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
