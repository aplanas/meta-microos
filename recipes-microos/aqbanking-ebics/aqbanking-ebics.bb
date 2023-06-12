SUMMARY = "Library for Online Banking Functions and Financial Data Import/Export"
DESCRIPTION = "AqBanking is a generic OnlineBanking interface. It allows multiple \
backends (currently HBCI) and multiple frontends  (e.g. KDE, GNOME, \
console) to be used."
LICENSE = "GPL-2.0-or-later"

PV = "6.5.4"

RPM_NAME = "aqbanking-ebics-6.5.4-1.1.aarch64.rpm"
RPM_HASH = "110a7c84e8c2ba2c1e4e02270fe934229c15bb481df561726990ac94f7324b91e8237e86b4c63f75904f1d89c50139d79d8b7b301fe68d3da481206afb4710f0"

RPROVIDES:${PN} += "aqbanking-ebics \
aqbanking-ebics(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
aqbanking \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libaqbanking.so.44()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgwenhywfar.so.79()(64bit)"

inherit rpm
