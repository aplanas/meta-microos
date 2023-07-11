SUMMARY = "Translations for package deepin-editor"
DESCRIPTION = "Provides translations for the 'deepin-editor' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.40"

RPM_NAME = "deepin-editor-lang-5.10.40-1.7.noarch.rpm"
RPM_HASH = "f10fe00e307c5d52d525d330d965e7f034d2fe004f494feb7c1c463955583a35692acf82be1e4a38ebb5bd9f6071802d22f0369a028c814c1c21a142751d58b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-editor-lang \
deepin-editor-lang-all"

RDEPENDS:${PN} += "deepin-editor"

inherit rpm
