SUMMARY = "Library for Open AuTHentication (OATH) HOTP support"
DESCRIPTION = "The OATH Toolkit makes it possible to build one-time password \
authentication systems. Supported technologies include the \
event-based HOTP algorithm (RFC4226) and the time-based TOTP algorithm \
(RFC6238)."
LICENSE = "LGPL-2.1-or-later"

PV = "2.6.7"

RPM_NAME = "liboath0-2.6.7-3.5.aarch64.rpm"
RPM_HASH = "1eda55674bb881ae5be4314e003dde9f0b9b036b4916e504ee6e691d493361d578ed8c0493e35eea7c6433fca5272d63b22f027aa7659e961fc322850f7f8e68"

RPROVIDES:${PN} += "liboath.so.0()(64bit) \
liboath.so.0(LIBOATH_1.10.0)(64bit) \
liboath.so.0(LIBOATH_1.12.0)(64bit) \
liboath.so.0(LIBOATH_1.2.0)(64bit) \
liboath.so.0(LIBOATH_1.4.0)(64bit) \
liboath.so.0(LIBOATH_1.6.0)(64bit) \
liboath.so.0(LIBOATH_1.8.0)(64bit) \
liboath.so.0(LIBOATH_2.2.0)(64bit) \
liboath.so.0(LIBOATH_2.6.0)(64bit) \
liboath0 \
liboath0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
oath-toolkit-xml"

inherit rpm
