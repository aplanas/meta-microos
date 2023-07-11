SUMMARY = "Translations for package wxmp3gain"
DESCRIPTION = "Provides translations for the 'wxmp3gain' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "wxmp3gain-lang-4.0-1.24.noarch.rpm"
RPM_HASH = "01055c4d007ac8be945d035255503a9a6f512bb6ab9bc3499393fe456d824d2ea459ea94160487e4373ff917b4cd4eb3790a1c13c7ed86a315eeb1e95b7cfd70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wxmp3gain-lang \
wxmp3gain-lang-all"

RDEPENDS:${PN} += "wxmp3gain"

inherit rpm
