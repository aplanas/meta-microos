SUMMARY = "Translations for package exiv2"
DESCRIPTION = "Provides translations for the 'exiv2' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "0.28.0"

RPM_NAME = "exiv2-lang-0.28.0-2.1.noarch.rpm"
RPM_HASH = "f3aa385ad55990ff7f7494114af6c81517ae6c55b2eb77fbd65ada557d8ba52c66e81cd1e8b32fe81e4067a49494ceca62ddfc5600178f0d5b6ee02e73223822"
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
