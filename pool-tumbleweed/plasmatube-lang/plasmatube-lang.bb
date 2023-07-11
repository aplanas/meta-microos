SUMMARY = "Translations for package plasmatube"
DESCRIPTION = "Provides translations for the 'plasmatube' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "plasmatube-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "2f65866e455ae91af1cf1dd8ae1db8dc0cf9eb32ffb72e2337e2faaaaab32edd7f9fb348581a38d29887be730d40be93fda74356494059d94fb5bccf6f8e7a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasmatube-ar \
locale-plasmatube-az \
locale-plasmatube-be \
locale-plasmatube-ca \
locale-plasmatube-ca@valencia \
locale-plasmatube-cs \
locale-plasmatube-de \
locale-plasmatube-en-GB \
locale-plasmatube-es \
locale-plasmatube-eu \
locale-plasmatube-fi \
locale-plasmatube-fr \
locale-plasmatube-gl \
locale-plasmatube-hi \
locale-plasmatube-hu \
locale-plasmatube-ia \
locale-plasmatube-id \
locale-plasmatube-it \
locale-plasmatube-ja \
locale-plasmatube-ka \
locale-plasmatube-ko \
locale-plasmatube-lt \
locale-plasmatube-nl \
locale-plasmatube-nn \
locale-plasmatube-pa \
locale-plasmatube-pl \
locale-plasmatube-pt \
locale-plasmatube-pt-BR \
locale-plasmatube-ru \
locale-plasmatube-sk \
locale-plasmatube-sl \
locale-plasmatube-sv \
locale-plasmatube-tr \
locale-plasmatube-uk \
locale-plasmatube-zh-CN \
locale-plasmatube-zh-TW \
plasmatube-lang \
plasmatube-lang-all"

RDEPENDS:${PN} += "plasmatube"

inherit rpm
