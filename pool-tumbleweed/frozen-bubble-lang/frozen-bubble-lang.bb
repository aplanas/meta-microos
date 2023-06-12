SUMMARY = "Translations for package frozen-bubble"
DESCRIPTION = "Provides translations for the 'frozen-bubble' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.212"

RPM_NAME = "frozen-bubble-lang-2.212-15.3.noarch.rpm"
RPM_HASH = "2dd39ca2b0f0c7b47c6929bab4b68e70fdb11ef29b98c65f2e76d89ad6c7afcf4e4404b5e77c79c00e3ec841ffbc26edb4776c96a8e98dc75cf3efca8a9e2b13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "frozen-bubble-lang \
frozen-bubble-lang-all"
RDEPENDS:${PN} += "frozen-bubble"

inherit rpm
