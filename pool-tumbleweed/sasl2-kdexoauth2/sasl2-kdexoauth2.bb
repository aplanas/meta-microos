SUMMARY = "Cyrus SASL plugin for using Google's XOAUTH"
DESCRIPTION = "This package provides a Cyrus SASL plugin to use Google's XOAUTH authentication \
for receiving and sending mail through Google servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "sasl2-kdexoauth2-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "ff8d2bd7e2aaafb04a73dc8d4ebe548d3ad6581564305beb96f8f05b736074438106fec0a601f3bb167ed48fad805503f362844ee6957b44aeefe155043d8ebf"

RPROVIDES:${PN} += "libkdexoauth2.so.3()(64bit) \
sasl2-kdexoauth2 \
sasl2-kdexoauth2(aarch-64) \
sasl2-kdexoauth2-3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
