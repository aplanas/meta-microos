SUMMARY = "YaST2 - Low Saxonian Translations"
DESCRIPTION = "YaST2 - Translations for Low Saxonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-nds-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "d955c5ba096d0eb486eb98b62f17bbf45df72c54897b1e22f30cd7c72741a38feb293efc7810ce068e39a5af963da5cddaec1f23e0f5c6b1e895299dae733e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nds \
yast2-trans-nds"

RDEPENDS:${PN} += ""

inherit rpm
