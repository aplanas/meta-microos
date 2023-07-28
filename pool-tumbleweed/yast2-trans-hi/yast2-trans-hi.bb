SUMMARY = "YaST2 - Hindi Translations"
DESCRIPTION = "YaST2 - Translations for Hindi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-hi-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "699c2f34e77eee405499751242a240d0d9741831f33f7a3501ab95ff06d51cb644d8e50cb0efa69370501776fd287629212d5dab23822724b953d7c2bc3098ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hi \
yast2-trans-hi"

RDEPENDS:${PN} += ""

inherit rpm
