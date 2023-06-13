SUMMARY = "Reference implementation for configuration of YubiKeys"
DESCRIPTION = "Yubico's YubiKey can be re-programmed. This project provides a reference implementation for configuration of YubiKeys."
LICENSE = "BSD-2-Clause"

PV = "1.20.0"

RPM_NAME = "ykpers-1.20.0-3.7.aarch64.rpm"
RPM_HASH = "19e79150e3ac9a9f79360c1d060c6b2a5b9b10c922fc82a3e0901832fe344aa591ba1c9381639459e20efda3c7ef667d5accd29dce8a1afeb62d1ace9a9a1397"

RPROVIDES:${PN} += "ykpers \
ykpers(aarch-64) \
yubikey-personalization"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libykpers-1.so.1()(64bit) \
libyubikey.so.0()(64bit)"

inherit rpm
