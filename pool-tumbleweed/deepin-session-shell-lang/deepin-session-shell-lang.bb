SUMMARY = "Translations for package deepin-session-shell"
DESCRIPTION = "Provides translations for the 'deepin-session-shell' package."
LICENSE = "GPL-3.0+"

PV = "5.5.48"

RPM_NAME = "deepin-session-shell-lang-5.5.48-1.4.noarch.rpm"
RPM_HASH = "1e22cbd21bc0d9fd22376a8a16b1a93e65729748c6779a5f0b830e46b0e28948bdbf3b02c0485c33649071efb08538b5fcc92d098496a2566d3854db084a2611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-session-shell-lang \
deepin-session-shell-lang-all"

RDEPENDS:${PN} += "deepin-session-shell"

inherit rpm
