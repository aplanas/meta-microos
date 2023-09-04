SUMMARY = "A password store library"
DESCRIPTION = "qtkeychain can be used to store passwords."
LICENSE = "BSD-2-Clause"

PV = "0.14.1"

RPM_NAME = "libqt5keychain1-0.14.1-1.1.aarch64.rpm"
RPM_HASH = "96102638bf56be6954a191bf2fab4e0c453124f76747a0c1ab31cebb4413e72cf00a67ffd55038b680ee706fd870f632b54e6d7c163a0db27cd9923e8856a1ff"

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
