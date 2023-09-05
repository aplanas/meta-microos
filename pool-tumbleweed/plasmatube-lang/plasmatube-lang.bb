SUMMARY = "Translations for package plasmatube"
DESCRIPTION = "Provides translations for the 'plasmatube' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "plasmatube-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "9d03ccd1f276cd901036ae7bd28d3ffc7e0b4ebaf0a5775d75cf275b87ffefb27af86bfaaff2721aee194501a642ede3a6d5cbbe52610cba81c4c87434fd14bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasmatube-ar \
locale-plasmatube-ast \
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
