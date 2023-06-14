SUMMARY = "Library for Open AuTHentication (OATH) HOTP support"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. Supported technologies include the \
event-based HOTP algorithm (RFC4226) and the time-based TOTP algorithm \
(RFC6238)."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.7"

RPM_NAME = "liboath0-2.6.7-3.5.aarch64.rpm"
RPM_HASH = "1eda55674bb881ae5be4314e003dde9f0b9b036b4916e504ee6e691d493361d578ed8c0493e35eea7c6433fca5272d63b22f027aa7659e961fc322850f7f8e68"

RPROVIDES:${PN} += "liboath.so.0 \
liboath0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
oath-toolkit-xml"

inherit rpm
