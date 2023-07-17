SUMMARY = "Library for Open AuTHentication (OATH) HOTP support"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. Supported technologies include the \
event-based HOTP algorithm (RFC4226) and the time-based TOTP algorithm \
(RFC6238)."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.8"

RPM_NAME = "liboath0-2.6.8-1.1.aarch64.rpm"
RPM_HASH = "d8029a4dc3bf9e14b6d4598b0b9610146b52e6612021c3b644d9666344bfa97bc00603897eaca1bb37b846f088198aa217ccbea624ca3cc5fa736419bfa94662"

RPROVIDES:${PN} += "liboath.so.0 \
liboath0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
oath-toolkit-xml"

inherit rpm
