SUMMARY = "Library for Online Banking Functions and Financial Data Import/Export"
DESCRIPTION = "AqBanking is a generic OnlineBanking interface. It allows multiple \
backends (currently HBCI) and multiple frontends  (e.g. KDE, GNOME, \
console) to be used."
LICENSE = "GPL-2.0-or-later"

PV = "6.5.4"

RPM_NAME = "aqbanking-devel-6.5.4-1.1.aarch64.rpm"
RPM_HASH = "c56a36121c6a871cffc9fa661994bee9271c5c6c8e50bf10ac2c537be679ba553eaefe7270c05b58790fa6f951a34af00a198a6d17715f3d56f714aef1a7266d"

RPROVIDES:${PN} += "aqbanking-devel \
aqbanking-devel(aarch-64) \
cmake(aqbanking) \
pkgconfig(aqbanking)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
aqbanking \
cmake \
glibc-devel \
gwenhywfar-devel \
ktoblzcheck-devel \
libltdl-devel \
libofx-devel \
xmlsec1-gnutls-devel"

inherit rpm
