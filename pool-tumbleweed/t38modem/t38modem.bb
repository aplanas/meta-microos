SUMMARY = "T.38 for OpenH323 (modem-compatible interface for IP telephony)"
DESCRIPTION = "This package contains a modem interface for IP telephony using the \
H.323 and T.38 protocol standards. It implements a 'tty' interface \
which resembles a FAX modem. A sample HylaFAX setup is also provided."
LICENSE = "MPL-1.1"

PV = "4.6.0"

RPM_NAME = "t38modem-4.6.0-1.6.aarch64.rpm"
RPM_HASH = "908e36796e508bc1d99b47be6e98193f711c0e0ddd2a045b43d393bf2b509e1300aebbbae8475226668f0e26abd46876f0164c973e7eb792dbd5cf3c85ef43df"

RPROVIDES:${PN} += "t38modem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libopal.so.3.18.8 \
libpt.so.2.18.8 \
libstdc++.so.6"

inherit rpm
