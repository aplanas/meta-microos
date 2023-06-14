SUMMARY = "KDE PIM Libraries: IMAP APIs"
DESCRIPTION = "This package provides the core library to interface and communicate with \
IMAP mail servers."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5IMAP5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "0911c48056acc7328059fcfa285d48c80ea3bf89c7b9c30e622711065958e362036e086bf7f45de3d4ea353d88ff1fdd6958eb6d56ad9b64a6df51224c955875"

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
