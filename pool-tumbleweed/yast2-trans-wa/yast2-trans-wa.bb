SUMMARY = "YaST2 - Walloon Translations"
DESCRIPTION = "YaST2 - Translations for Walloon."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-wa-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "d2a19b6afcfaa5e6a9e0cdf5591611610dbdf09d54e2fa12989ef9d1f6a49419b7d43c2d50adbb106a19a42da9c7590bfdafbeda1a167e8d61ff00fcdc6fe014"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-wa \
yast2-trans-wa"

RDEPENDS:${PN} += ""

inherit rpm
