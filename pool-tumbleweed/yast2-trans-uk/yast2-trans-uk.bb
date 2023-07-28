SUMMARY = "YaST2 - Ukrainian Translations"
DESCRIPTION = "YaST2 - Translations for Ukrainian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-uk-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "36db241fdcc85743d1c8a8ff800d3f9c33ffa51629824fbf83037b7d7c97042556119e276c6c47356dcfdf21849b6f024274a17c5662b1fe60428926f0ac44e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-uk \
yast2-trans-uk"

RDEPENDS:${PN} += ""

inherit rpm
