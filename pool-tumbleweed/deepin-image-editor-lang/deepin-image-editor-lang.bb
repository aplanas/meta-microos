SUMMARY = "Translations for package deepin-image-editor"
DESCRIPTION = "Provides translations for the 'deepin-image-editor' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "deepin-image-editor-lang-1.0.24-1.1.noarch.rpm"
RPM_HASH = "1525d14e35f42eabc4a31688a437731c9762ddc0f7c9313ebebf5066bbf84fd520a4500a211b0156cb0755bc32460fcde5106bdd0d62a0f2fd1714d369c06a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-image-editor-lang \
deepin-image-editor-lang-all"

RDEPENDS:${PN} += "deepin-image-editor"

inherit rpm
