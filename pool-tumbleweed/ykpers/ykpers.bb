SUMMARY = "Reference implementation for configuration of YubiKeys"
DESCRIPTION = "Yubico's YubiKey can be re-programmed. This project provides a reference implementation for configuration of YubiKeys."
LICENSE = "BSD-2-Clause"

PV = "1.20.0"

RPM_NAME = "ykpers-1.20.0-3.8.aarch64.rpm"
RPM_HASH = "2d1bedc10bf7e192ba499f1d53ca23e862a4b838ee2020c7a30c5e940cd365f798d12eecef66d21100879021e5b2532aea022454382a66b8e7089d72a0d4736f"

RPROVIDES:${PN} += "ykpers \
yubikey-personalization"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libykpers-1.so.1 \
libyubikey.so.0"

inherit rpm
