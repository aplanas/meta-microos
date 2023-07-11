SUMMARY = "T.38 for OpenH323 (modem-compatible interface for IP telephony)"
DESCRIPTION = "This package contains a modem interface for IP telephony using the \
H.323 and T.38 protocol standards. It implements a 'tty' interface \
which resembles a FAX modem. A sample HylaFAX setup is also provided."
LICENSE = "MPL-1.1"

PV = "4.6.0"

RPM_NAME = "t38modem-4.6.0-1.7.aarch64.rpm"
RPM_HASH = "f940238b4f1dd9406f3778464efec1a0be842d32725314ecdb187a8e9f349aee5c376069bc62063aee4bd7f7e9be929aa565808704739d0e2b79a2a9dcebb742"

RPROVIDES:${PN} += "t38modem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopal.so.3.18.8 \
libpt.so.2.18.8 \
libstdc++.so.6"

inherit rpm
