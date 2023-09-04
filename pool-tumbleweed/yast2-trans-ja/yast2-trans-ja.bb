SUMMARY = "YaST2 - Japanese Translations"
DESCRIPTION = "YaST2 - Japanese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-ja-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "317d7cb8ba39fda7a44ab1a68c7d5ac078818952ccc4880373b385e43453c331a3fe6246d30b2f91becf00da64c12cd941851573023fcc4089009930cb7e3a6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ja \
yast2-trans-ja"

RDEPENDS:${PN} += ""

inherit rpm
