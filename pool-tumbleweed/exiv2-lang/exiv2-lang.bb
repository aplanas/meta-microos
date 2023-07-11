SUMMARY = "Translations for package exiv2"
DESCRIPTION = "Provides translations for the 'exiv2' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "exiv2-lang-0.28.0-1.1.noarch.rpm"
RPM_HASH = "b88bf7a0b3fd1b2a7c5eb1e51982ffc83dfae30f116e69b965597f8cc9bfdbea7e888c883a73f1606582c698a89ef3a99635b95ed2b7af33d00edb9a2cad1d8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exiv2-lang \
exiv2-lang-all \
locale-exiv2-bs \
locale-exiv2-ca \
locale-exiv2-de \
locale-exiv2-es \
locale-exiv2-fi \
locale-exiv2-fr \
locale-exiv2-gl \
locale-exiv2-ms \
locale-exiv2-nl \
locale-exiv2-pl \
locale-exiv2-pt \
locale-exiv2-ru \
locale-exiv2-sk \
locale-exiv2-sv \
locale-exiv2-ug \
locale-exiv2-uk \
locale-exiv2-vi"

RDEPENDS:${PN} += "exiv2"

inherit rpm
