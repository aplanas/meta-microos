SUMMARY = "Java package archiver"
DESCRIPTION = "Fastjar is an implementation of Sun's jar utility that comes with the \
JDK, written entirely in C, and runs in a fraction of the time while \
being 100% feature compatible."
LICENSE = "GPL-2.0-or-later"

PV = "0.98"

RPM_NAME = "fastjar-0.98-26.9.aarch64.rpm"
RPM_HASH = "ff6e46edcca4d5850c14a392ae8dd0982dae93f0aa3ac212d0662e7ff121b8a6614073874769e3e67641a93a6440fec72204de6f891db083292d2ef8ee304170"

RPROVIDES:${PN} += "fastjar"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
