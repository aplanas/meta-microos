SUMMARY = "KDE PIM Libraries: IMAP APIs"
DESCRIPTION = "This package provides the core library to interface and communicate with \
IMAP mail servers."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5IMAP5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "ead0c4aa2170a09bb1a394303b2f310d209ddade16155112cdbd1f939142610164d7465fecaf9a3dc2a5e98b0b9307ef3be40381e87dd2fb7ebddf451f6ad642"

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
