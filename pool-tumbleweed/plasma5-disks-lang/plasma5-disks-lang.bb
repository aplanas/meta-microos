SUMMARY = "Translations for package plasma5-disks"
DESCRIPTION = "Provides translations for the 'plasma5-disks' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "plasma5-disks-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "87af356c29bda04da77e0a1b23a7119f1f9a336cb4b29e620e602319f244e20062957111e508b6446da696721df6cb63c9b776b022adda884705dbf799546706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-disks-az \
locale-plasma5-disks-bg \
locale-plasma5-disks-ca \
locale-plasma5-disks-ca@valencia \
locale-plasma5-disks-cs \
locale-plasma5-disks-da \
locale-plasma5-disks-de \
locale-plasma5-disks-el \
locale-plasma5-disks-en-GB \
locale-plasma5-disks-es \
locale-plasma5-disks-et \
locale-plasma5-disks-eu \
locale-plasma5-disks-fi \
locale-plasma5-disks-fr \
locale-plasma5-disks-gl \
locale-plasma5-disks-hu \
locale-plasma5-disks-ia \
locale-plasma5-disks-id \
locale-plasma5-disks-is \
locale-plasma5-disks-it \
locale-plasma5-disks-ja \
locale-plasma5-disks-ka \
locale-plasma5-disks-ko \
locale-plasma5-disks-lt \
locale-plasma5-disks-nl \
locale-plasma5-disks-nn \
locale-plasma5-disks-pa \
locale-plasma5-disks-pl \
locale-plasma5-disks-pt \
locale-plasma5-disks-pt-BR \
locale-plasma5-disks-ro \
locale-plasma5-disks-ru \
locale-plasma5-disks-sk \
locale-plasma5-disks-sl \
locale-plasma5-disks-sv \
locale-plasma5-disks-tr \
locale-plasma5-disks-uk \
locale-plasma5-disks-zh-CN \
locale-plasma5-disks-zh-TW \
plasma5-disks-lang \
plasma5-disks-lang-all"

RDEPENDS:${PN} += "plasma5-disks"

inherit rpm
