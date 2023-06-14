SUMMARY = "Translations for package audacity"
DESCRIPTION = "Provides translations for the 'audacity' package."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later & GPL-3.0-only"

PV = "3.3.2"

RPM_NAME = "audacity-lang-3.3.2-1.2.noarch.rpm"
RPM_HASH = "4d0768d1fa384ec71b169ac94a3b31daa1174c298aea526e9aae5b10a8d7ade84b2450f8a6514cca4a32ea187c2a96d9f3d4883145914aed82d53f2f0f287056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audacity-lang \
audacity-lang-all \
locale-audacity-af \
locale-audacity-ar \
locale-audacity-be \
locale-audacity-bg \
locale-audacity-bn \
locale-audacity-bs \
locale-audacity-ca \
locale-audacity-cs \
locale-audacity-cy \
locale-audacity-da \
locale-audacity-de \
locale-audacity-el \
locale-audacity-es \
locale-audacity-eu \
locale-audacity-fa \
locale-audacity-fi \
locale-audacity-fr \
locale-audacity-ga \
locale-audacity-gl \
locale-audacity-he \
locale-audacity-hi \
locale-audacity-hr \
locale-audacity-hu \
locale-audacity-id \
locale-audacity-it \
locale-audacity-ja \
locale-audacity-ka \
locale-audacity-km \
locale-audacity-ko \
locale-audacity-lt \
locale-audacity-mk \
locale-audacity-mr \
locale-audacity-nb \
locale-audacity-nl \
locale-audacity-oc \
locale-audacity-pl \
locale-audacity-pt-BR \
locale-audacity-pt-PT \
locale-audacity-ro \
locale-audacity-ru \
locale-audacity-sk \
locale-audacity-sl \
locale-audacity-sv \
locale-audacity-ta \
locale-audacity-tr \
locale-audacity-uk \
locale-audacity-vi \
locale-audacity-zh-CN \
locale-audacity-zh-TW"

RDEPENDS:${PN} += "audacity"

inherit rpm
