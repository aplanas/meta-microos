SUMMARY = "Translations for package calls"
DESCRIPTION = "Provides translations for the 'calls' package."
LICENSE = "GPL-3.0-only & MIT"

PV = "44.2"

RPM_NAME = "calls-lang-44.2-1.1.noarch.rpm"
RPM_HASH = "f9c5f453c458490def36720047d36e1528302918eb66e8685f8f68637717d1bbf47ce5ad24dc155ec19fdbbad7dc59c3e9f15ff7e1d821b75e4c6d860311eb72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calls-lang \
calls-lang-all \
locale-calls-be \
locale-calls-bg \
locale-calls-ca \
locale-calls-cs \
locale-calls-da \
locale-calls-de \
locale-calls-el \
locale-calls-en-GB \
locale-calls-eo \
locale-calls-es \
locale-calls-eu \
locale-calls-fa \
locale-calls-fi \
locale-calls-fr \
locale-calls-fur \
locale-calls-gl \
locale-calls-he \
locale-calls-hi \
locale-calls-hr \
locale-calls-hu \
locale-calls-id \
locale-calls-it \
locale-calls-ja \
locale-calls-ka \
locale-calls-ko \
locale-calls-lt \
locale-calls-nl \
locale-calls-oc \
locale-calls-pl \
locale-calls-pt \
locale-calls-pt-BR \
locale-calls-ro \
locale-calls-ru \
locale-calls-sk \
locale-calls-sl \
locale-calls-sr \
locale-calls-sv \
locale-calls-tr \
locale-calls-uk \
locale-calls-vi \
locale-calls-zh-CN \
locale-calls-zh-TW"

RDEPENDS:${PN} += "calls"

inherit rpm
