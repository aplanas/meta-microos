SUMMARY = "A password store library"
DESCRIPTION = "qtkeychain can be used to store passwords."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "libqt5keychain1-0.13.2-4.1.aarch64.rpm"
RPM_HASH = "a53d57c1fed57c3eddbe470667015381522371aff9cbe3a2fa6cc63c0585708e9f827c90699d412dc5b9de2b398b1be5a16dd8bc6cd05af20f9889f0055a2338"

RPROVIDES:${PN} += "libqt5keychain.so.1 \
libqt5keychain1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm
