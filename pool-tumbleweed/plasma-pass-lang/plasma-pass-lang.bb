SUMMARY = "Translations for package plasma-pass"
DESCRIPTION = "Provides translations for the 'plasma-pass' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "plasma-pass-lang-1.2.0-3.9.noarch.rpm"
RPM_HASH = "fbd92991c697580f38163d2fcdd9848b93c25a5652e457782fb870be7d8c0bf5e81db5da8b115fbb36da8fcdce721501b028dfdb463caf9799fbc279843ed632"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma-pass-ast \
locale-plasma-pass-az \
locale-plasma-pass-ca \
locale-plasma-pass-ca@valencia \
locale-plasma-pass-cs \
locale-plasma-pass-da \
locale-plasma-pass-de \
locale-plasma-pass-el \
locale-plasma-pass-en-GB \
locale-plasma-pass-es \
locale-plasma-pass-et \
locale-plasma-pass-eu \
locale-plasma-pass-fi \
locale-plasma-pass-fr \
locale-plasma-pass-gl \
locale-plasma-pass-hi \
locale-plasma-pass-hu \
locale-plasma-pass-ia \
locale-plasma-pass-it \
locale-plasma-pass-ko \
locale-plasma-pass-lt \
locale-plasma-pass-nl \
locale-plasma-pass-nn \
locale-plasma-pass-pa \
locale-plasma-pass-pl \
locale-plasma-pass-pt \
locale-plasma-pass-pt-BR \
locale-plasma-pass-ro \
locale-plasma-pass-ru \
locale-plasma-pass-sk \
locale-plasma-pass-sl \
locale-plasma-pass-sv \
locale-plasma-pass-uk \
locale-plasma-pass-zh-TW \
plasma-pass-lang \
plasma-pass-lang-all"

RDEPENDS:${PN} += "plasma-pass"

inherit rpm
