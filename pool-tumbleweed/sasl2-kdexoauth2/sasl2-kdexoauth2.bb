SUMMARY = "Cyrus SASL plugin for using Google's XOAUTH"
DESCRIPTION = "This package provides a Cyrus SASL plugin to use Google's XOAUTH authentication \
for receiving and sending mail through Google servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "sasl2-kdexoauth2-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "48f98a591e63da0d17ea7dc8ffeac991bdd198d8ed38fc66fb1524ad24b6bee1135ff9acef054af083e372851988f66d987bf7bed63f21a5557d1161be3b4900"

RPROVIDES:${PN} += "libkdexoauth2.so.3 \
sasl2-kdexoauth2 \
sasl2-kdexoauth2-3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
