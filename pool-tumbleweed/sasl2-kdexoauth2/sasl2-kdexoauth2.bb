SUMMARY = "Cyrus SASL plugin for using Google's XOAUTH"
DESCRIPTION = "This package provides a Cyrus SASL plugin to use Google's XOAUTH authentication \
for receiving and sending mail through Google servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "sasl2-kdexoauth2-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "e3a0cf181af644b4410b3070f8cb4bd77e38fb409c0fb8b935b256b8ee95d1f1a915394fd0248ae79a61ed93c84b911b327d2b820020533ad80d9ff81b574d5c"

RPROVIDES:${PN} += "libkdexoauth2.so.3 \
sasl2-kdexoauth2 \
sasl2-kdexoauth2-3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
