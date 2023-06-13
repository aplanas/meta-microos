SUMMARY = "Translations for package deepin-editor"
DESCRIPTION = "Provides translations for the 'deepin-editor' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.40"

RPM_NAME = "deepin-editor-lang-5.10.40-1.6.noarch.rpm"
RPM_HASH = "bb5d0daa1611d11907e8e6ebf9d07be3a5e34765764f5d01fa033d594dbc2734e433b65d85aa6d6075b0fd161c2a7d30af886a108de86a24b252d3310c76e121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-editor-lang \
deepin-editor-lang-all"

RDEPENDS:${PN} += "deepin-editor"

inherit rpm
