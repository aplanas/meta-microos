SUMMARY = "Translations for package deepin-file-manager"
DESCRIPTION = "Provides translations for the 'deepin-file-manager' package."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "5.6.4"

RPM_NAME = "deepin-file-manager-lang-5.6.4-3.9.noarch.rpm"
RPM_HASH = "1f600c5d9c1e1c4db781ed2db6403cebcfc5caed2151d1174bb257b131122d48ac840af83d56a8bdcae2e55167217e7ee261664ab08bbca4d520e901623a2fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-file-manager-lang \
deepin-file-manager-lang-all"

RDEPENDS:${PN} += "deepin-file-manager"

inherit rpm
