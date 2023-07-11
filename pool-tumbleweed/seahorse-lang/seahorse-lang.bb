SUMMARY = "Translations for package seahorse"
DESCRIPTION = "Provides translations for the 'seahorse' package."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "seahorse-lang-43.0-3.6.noarch.rpm"
RPM_HASH = "d1f44c3dfbbee04b0b1225007b2668fca27143dbd059b9e6b52828466a092cbc74c0689f3b7382ae224fef95584aaf0e6f78bd9c59b30c4121902248359b32d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-seahorse-ar \
locale-seahorse-as \
locale-seahorse-ast \
locale-seahorse-az \
locale-seahorse-be \
locale-seahorse-be@latin \
locale-seahorse-bg \
locale-seahorse-bn \
locale-seahorse-bn-IN \
locale-seahorse-br \
locale-seahorse-bs \
locale-seahorse-ca \
locale-seahorse-ca@valencia \
locale-seahorse-cs \
locale-seahorse-cy \
locale-seahorse-da \
locale-seahorse-de \
locale-seahorse-dz \
locale-seahorse-el \
locale-seahorse-en-CA \
locale-seahorse-en-GB \
locale-seahorse-en@shaw \
locale-seahorse-eo \
locale-seahorse-es \
locale-seahorse-et \
locale-seahorse-eu \
locale-seahorse-fa \
locale-seahorse-fi \
locale-seahorse-fr \
locale-seahorse-fur \
locale-seahorse-ga \
locale-seahorse-gd \
locale-seahorse-gl \
locale-seahorse-gu \
locale-seahorse-he \
locale-seahorse-hi \
locale-seahorse-hr \
locale-seahorse-hu \
locale-seahorse-id \
locale-seahorse-is \
locale-seahorse-it \
locale-seahorse-ja \
locale-seahorse-ka \
locale-seahorse-kk \
locale-seahorse-kn \
locale-seahorse-ko \
locale-seahorse-lt \
locale-seahorse-lv \
locale-seahorse-mai \
locale-seahorse-mk \
locale-seahorse-ml \
locale-seahorse-mr \
locale-seahorse-ms \
locale-seahorse-nb \
locale-seahorse-ne \
locale-seahorse-nl \
locale-seahorse-nn \
locale-seahorse-oc \
locale-seahorse-or \
locale-seahorse-pa \
locale-seahorse-pl \
locale-seahorse-pt \
locale-seahorse-pt-BR \
locale-seahorse-ro \
locale-seahorse-ru \
locale-seahorse-si \
locale-seahorse-sk \
locale-seahorse-sl \
locale-seahorse-sq \
locale-seahorse-sr \
locale-seahorse-sr@latin \
locale-seahorse-sv \
locale-seahorse-ta \
locale-seahorse-te \
locale-seahorse-th \
locale-seahorse-tr \
locale-seahorse-ug \
locale-seahorse-uk \
locale-seahorse-vi \
locale-seahorse-zh-CN \
locale-seahorse-zh-HK \
locale-seahorse-zh-TW \
seahorse-lang \
seahorse-lang-all"

RDEPENDS:${PN} += "seahorse"

inherit rpm
