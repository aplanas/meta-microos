SUMMARY = "Translations for package aqbanking"
DESCRIPTION = "Provides translations for the 'aqbanking' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "6.5.4"

RPM_NAME = "aqbanking-lang-6.5.4-1.1.noarch.rpm"
RPM_HASH = "661ff1c65d615abc14b2974da172eff3615eff67632d10858deaa02935e9758c8dbe2550692ad3475eeace8ae342d3212c93f1039d8e4e7cd9ee608b477f1347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aqbanking-lang \
aqbanking-lang-all \
locale(aqbanking:de)"
RDEPENDS:${PN} += "aqbanking"

inherit rpm
