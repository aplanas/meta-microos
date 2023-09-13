SUMMARY = "YaST2 - Marathi Translations"
DESCRIPTION = "YaST2 - Translations for Marathi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-mr-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "2aa32e5f1c16dc2fe36154477e68e3ac0006544821d7ceba6a1c622fcb52c7a490d23444b12e3049934699842c26952bbe70e1dc6eb51d2909c5c4b811e9c5c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mr \
yast2-trans-mr"

RDEPENDS:${PN} += ""

inherit rpm
