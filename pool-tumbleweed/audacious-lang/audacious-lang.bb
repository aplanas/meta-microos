SUMMARY = "Translations for package audacious"
DESCRIPTION = "Provides translations for the 'audacious' package."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "audacious-lang-4.3.1-2.1.noarch.rpm"
RPM_HASH = "befbffda97ff33c10e9b86377f08c1df3289e76daa532e75a9bb7a310c366f92d44dd2d66bb4a0089ae25470531544696970d841e6f335b83cd4f391c8087b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audacious-lang \
audacious-lang-all \
locale-audacious-af \
locale-audacious-ar \
locale-audacious-be \
locale-audacious-bg \
locale-audacious-ca \
locale-audacious-cs \
locale-audacious-da \
locale-audacious-de \
locale-audacious-el \
locale-audacious-en-GB \
locale-audacious-es \
locale-audacious-es-AR \
locale-audacious-es-MX \
locale-audacious-et \
locale-audacious-eu \
locale-audacious-fi \
locale-audacious-fr \
locale-audacious-gl \
locale-audacious-hu \
locale-audacious-it \
locale-audacious-ja \
locale-audacious-ko \
locale-audacious-lt \
locale-audacious-lv \
locale-audacious-ms \
locale-audacious-nl \
locale-audacious-pl \
locale-audacious-pt-BR \
locale-audacious-pt-PT \
locale-audacious-ro \
locale-audacious-ru \
locale-audacious-si \
locale-audacious-sk \
locale-audacious-sl \
locale-audacious-sq \
locale-audacious-sr \
locale-audacious-sv \
locale-audacious-ta \
locale-audacious-tr \
locale-audacious-uk \
locale-audacious-zh-CN \
locale-audacious-zh-TW"

RDEPENDS:${PN} += "audacious"

inherit rpm
