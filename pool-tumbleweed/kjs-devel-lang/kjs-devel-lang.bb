SUMMARY = "Translations for package kjs-devel"
DESCRIPTION = "Provides translations for the 'kjs-devel' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kjs-devel-lang-5.108.0-1.1.noarch.rpm"
RPM_HASH = "f051c6eee81ae822ec99f4109ec4a046a614e3414abdb69068b1a8325d41092c7cfaebe6b95be1cb95bf0269fed643600eceab0c541fc3eeef99ab93b5793e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kjs-devel-lang \
kjs-devel-lang-all"

RDEPENDS:${PN} += "kjs-devel"

inherit rpm
