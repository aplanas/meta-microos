SUMMARY = "Translations for package PackageKit"
DESCRIPTION = "Provides translations for the 'PackageKit' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.5"

RPM_NAME = "PackageKit-lang-1.2.5-9.4.noarch.rpm"
RPM_HASH = "7eadc034dcc2db02752b9a204d042d267ac490da1699a734913bc749b9773f8349dac25478b50728be064e02a461405b09321a23919526efc36c29d966624ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PackageKit-lang \
PackageKit-lang-all \
locale-PackageKit-ar \
locale-PackageKit-as \
locale-PackageKit-ast \
locale-PackageKit-az \
locale-PackageKit-bg \
locale-PackageKit-bn-IN \
locale-PackageKit-br \
locale-PackageKit-ca \
locale-PackageKit-ca@valencia \
locale-PackageKit-cs \
locale-PackageKit-cy \
locale-PackageKit-da \
locale-PackageKit-de \
locale-PackageKit-el \
locale-PackageKit-en-GB \
locale-PackageKit-eo \
locale-PackageKit-es \
locale-PackageKit-eu \
locale-PackageKit-fa \
locale-PackageKit-fi \
locale-PackageKit-fr \
locale-PackageKit-ga \
locale-PackageKit-gl \
locale-PackageKit-gu \
locale-PackageKit-he \
locale-PackageKit-hi \
locale-PackageKit-hr \
locale-PackageKit-hu \
locale-PackageKit-ia \
locale-PackageKit-id \
locale-PackageKit-it \
locale-PackageKit-ja \
locale-PackageKit-ka \
locale-PackageKit-kk \
locale-PackageKit-kn \
locale-PackageKit-ko \
locale-PackageKit-lt \
locale-PackageKit-lv \
locale-PackageKit-ml \
locale-PackageKit-mr \
locale-PackageKit-ms \
locale-PackageKit-nb \
locale-PackageKit-nl \
locale-PackageKit-nn \
locale-PackageKit-oc \
locale-PackageKit-or \
locale-PackageKit-pa \
locale-PackageKit-pl \
locale-PackageKit-pt \
locale-PackageKit-pt-BR \
locale-PackageKit-ro \
locale-PackageKit-ru \
locale-PackageKit-sk \
locale-PackageKit-sl \
locale-PackageKit-sq \
locale-PackageKit-sr \
locale-PackageKit-sr@latin \
locale-PackageKit-sv \
locale-PackageKit-ta \
locale-PackageKit-te \
locale-PackageKit-th \
locale-PackageKit-tr \
locale-PackageKit-uk \
locale-PackageKit-vi \
locale-PackageKit-wa \
locale-PackageKit-zh-CN \
locale-PackageKit-zh-HK \
locale-PackageKit-zh-TW"

RDEPENDS:${PN} += "PackageKit"

inherit rpm
