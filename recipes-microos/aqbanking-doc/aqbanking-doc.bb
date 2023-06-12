SUMMARY = "Library for Online Banking Functions and Financial Data Import/Export"
DESCRIPTION = "AqBanking is a generic OnlineBanking interface. It allows multiple \
backends (currently HBCI) and multiple frontends  (e.g. KDE, GNOME, \
console) to be used. \
 \
This package contains a handbook."
LICENSE = "SUSE-Free-Art-1.3"

PV = "6.5.4"

RPM_NAME = "aqbanking-doc-6.5.4-1.1.aarch64.rpm"
RPM_HASH = "951c0265d39a59886b5b1e359ae41efc7003c941c7b2697c6e5985cb1dbe2b110b2fe6b2ecadbbee1e8604990a901a52420089ce8f4647a137166e28cf7f7732"

RPROVIDES:${PN} += "aqbanking-doc \
aqbanking-doc(aarch-64)"
RDEPENDS:${PN} += "aqbanking"

inherit rpm
