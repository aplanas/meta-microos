SUMMARY = "YaST2 - Japanese Translations"
DESCRIPTION = "YaST2 - Japanese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-ja-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "59877423eff29e37403d18d8ff4ed0029cad7c7f3519c49b9f8bfc5845d915116f88c9b87e1a660f9a0fa03774ba5503674fa8d3c5276e31cf74b5ffb8fb72c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ja \
yast2-trans-ja"

RDEPENDS:${PN} += ""

inherit rpm
