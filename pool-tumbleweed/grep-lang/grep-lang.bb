SUMMARY = "Translations for package grep"
DESCRIPTION = "Provides translations for the 'grep' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.11"

RPM_NAME = "grep-lang-3.11-2.1.noarch.rpm"
RPM_HASH = "b28d28f1da94fa96b13f3b58d472003c44ff9eaddfdf6f8df955fb536795889830e4d9aa10fe63ba095b20d9c6d4277f5eb3dc43140f167c4a185188af43b450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grep-lang \
grep-lang-all \
locale-grep-af \
locale-grep-be \
locale-grep-bg \
locale-grep-ca \
locale-grep-cs \
locale-grep-da \
locale-grep-de \
locale-grep-el \
locale-grep-eo \
locale-grep-es \
locale-grep-et \
locale-grep-eu \
locale-grep-fi \
locale-grep-fr \
locale-grep-ga \
locale-grep-gl \
locale-grep-he \
locale-grep-hr \
locale-grep-hu \
locale-grep-id \
locale-grep-it \
locale-grep-ja \
locale-grep-ka \
locale-grep-ko \
locale-grep-lt \
locale-grep-nb \
locale-grep-nl \
locale-grep-pa \
locale-grep-pl \
locale-grep-pt \
locale-grep-pt-BR \
locale-grep-ro \
locale-grep-ru \
locale-grep-sk \
locale-grep-sl \
locale-grep-sr \
locale-grep-sv \
locale-grep-ta \
locale-grep-th \
locale-grep-tr \
locale-grep-uk \
locale-grep-vi \
locale-grep-zh-CN \
locale-grep-zh-TW"

RDEPENDS:${PN} += "grep"

inherit rpm
