SUMMARY = "KDE PIM Libraries: IMAP APIs"
DESCRIPTION = "This package provides the core library to interface and communicate with \
IMAP mail servers."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKPim5IMAP5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "7a889614f896ec6a68a9f8a5b777d24a73c69e75027c0af37767375d6f2bb300c713d6d2353ad365ee62da8d28c594fcc9023084cc900b81bb8538bb4b0be19f"

RPROVIDES:${PN} += "kimap \
libKPim5IMAP.so.5 \
libKPim5IMAP5"

RDEPENDS:${PN} += "/sbin/ldconfig \
cyrus-sasl-crammd5 \
cyrus-sasl-digestmd5 \
cyrus-sasl-gssapi \
cyrus-sasl-plain \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libsasl2.so.3 \
libstdc++.so.6 \
sasl2-kdexoauth2"

inherit rpm
