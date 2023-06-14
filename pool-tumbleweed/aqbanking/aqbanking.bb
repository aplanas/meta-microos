SUMMARY = "Library for Online Banking Functions and Financial Data Import and Export"
DESCRIPTION = "AqBanking is a generic online banking interface. It allows multiple \
back-ends (currently HBCI) and multiple front-ends (such as KDE, GNOME, \
or console) to be used."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "aqbanking-6.5.4-1.1.aarch64.rpm"
RPM_HASH = "c04dea8bd7aba5e12fa8cd705fffdef0e55a3b3a51abdb155c40dd91d088ec08ed2fda49db2331e63c44b9339255b86116c82d021a7b45c1be2669c57cfc17d6"

RPROVIDES:${PN} += "aqbanking \
libaqbanking.so.44"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libgwenhywfar.so.79 \
libxml2.so.2 \
libxmlsec1.so.1 \
libz.so.1"

inherit rpm
