SUMMARY = "YaST2 - Brazilian Portuguese Translations"
DESCRIPTION = "YaST2 - Translations for Brazilian Portuguese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-pt_BR-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "8a4d1abb0493c25c05521aefbe955686fc13f7de9416025eb49d9c8a391d1f401ccd5e205dcc5986f0eebe6a3fa5d2ab31d01d11e31a78d457a4d08bdd5fa5ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pt-BR \
yast2-trans-pt-BR"

RDEPENDS:${PN} += ""

inherit rpm
