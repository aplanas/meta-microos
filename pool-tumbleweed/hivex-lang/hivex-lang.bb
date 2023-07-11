SUMMARY = "Translations for package hivex"
DESCRIPTION = "Provides translations for the 'hivex' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "hivex-lang-1.3.23-2.5.noarch.rpm"
RPM_HASH = "903911abc0ff8957fc19cbaf3c0eaa273f66bf80508f369da85ba4e2dab4f0ec76b22af529b65c1b18e99529c82c34d1daad5bcf96807d868dbb5940d9d24cfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hivex-lang \
hivex-lang-all \
locale-hivex-ca \
locale-hivex-cs \
locale-hivex-de \
locale-hivex-es \
locale-hivex-eu \
locale-hivex-fr \
locale-hivex-gu \
locale-hivex-hi \
locale-hivex-hu \
locale-hivex-ja \
locale-hivex-ka \
locale-hivex-kn \
locale-hivex-ml \
locale-hivex-mr \
locale-hivex-nl \
locale-hivex-or \
locale-hivex-pl \
locale-hivex-pt \
locale-hivex-pt-BR \
locale-hivex-ru \
locale-hivex-si \
locale-hivex-sr \
locale-hivex-uk \
locale-hivex-zh-CN"

RDEPENDS:${PN} += "hivex"

inherit rpm
