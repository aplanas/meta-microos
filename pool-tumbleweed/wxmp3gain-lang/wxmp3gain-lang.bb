SUMMARY = "Translations for package wxmp3gain"
DESCRIPTION = "Provides translations for the 'wxmp3gain' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "wxmp3gain-lang-4.0-1.23.noarch.rpm"
RPM_HASH = "1483411e93f8f69cbabba9c6d201d7915591e54bdc3c2f7fc569f504944e31a5750336a3ef740aafd38b497881f0bf3a07087d076c33fa2a8047c544de04a3dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wxmp3gain-lang \
wxmp3gain-lang-all"

RDEPENDS:${PN} += "wxmp3gain"

inherit rpm
