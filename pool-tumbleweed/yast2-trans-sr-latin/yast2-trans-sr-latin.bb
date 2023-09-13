SUMMARY = "YaST2 - Serbian (Latin) Translations"
DESCRIPTION = "YaST2 - Translations for Serbian (Latin)."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-sr-latin-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "f5100c6467ca81b0832b61a9ae36fc42805d38b78b72eda16ff8e9b7ce1695482402feb7965ca70a4820fbcf2c2616cef401b60859958c9f44459f29918b60ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr@latin \
yast2-trans-sr-latin"

RDEPENDS:${PN} += ""

inherit rpm
