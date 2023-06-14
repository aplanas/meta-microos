SUMMARY = "Translations for package cutterff"
DESCRIPTION = "Provides translations for the 'cutterff' package."
LICENSE = "GPL-3.0-only"

PV = "1.0.2"

RPM_NAME = "cutterff-lang-1.0.2-1.6.noarch.rpm"
RPM_HASH = "6bd902351613672ddbbdec8b49bb724f453faf62b25e7d765cafcc6d1edbb35b295c9cffaf95f8e96d29ad726f09c88fceb73d54da5a05ca42e18f5911c68100"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cutterff-lang \
cutterff-lang-all \
locale-cutterff-de"

RDEPENDS:${PN} += "cutterff"

inherit rpm
