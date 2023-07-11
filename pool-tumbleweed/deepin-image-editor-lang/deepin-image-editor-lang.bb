SUMMARY = "Translations for package deepin-image-editor"
DESCRIPTION = "Provides translations for the 'deepin-image-editor' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "deepin-image-editor-lang-1.0.24-1.2.noarch.rpm"
RPM_HASH = "3bfc66f2c84938884eb9881fec896e832a5ce6cc2abd8c06158795cc506f88adfaec100f07024db397f0aff0619c8e8cbd34e571d2ae2a1dc1f0f8976bda4dd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-image-editor-lang \
deepin-image-editor-lang-all"

RDEPENDS:${PN} += "deepin-image-editor"

inherit rpm
