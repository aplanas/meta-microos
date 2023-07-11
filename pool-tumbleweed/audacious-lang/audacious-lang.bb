SUMMARY = "Translations for package audacious"
DESCRIPTION = "Provides translations for the 'audacious' package."
LICENSE = "BSD-2-Clause"

PV = "4.3.1"

RPM_NAME = "audacious-lang-4.3.1-1.1.noarch.rpm"
RPM_HASH = "c1c21a4f80e1d5615836d2feae1a21c6eaeee7973abbeb707a8b9538f032a64cda1e9db4fc50a228a6337e2071268452d50e9921127ca6b4f1c7cdbb75e64b66"
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
