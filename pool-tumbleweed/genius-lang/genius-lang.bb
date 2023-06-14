SUMMARY = "Translations for package genius"
DESCRIPTION = "Provides translations for the 'genius' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.27"

RPM_NAME = "genius-lang-1.0.27-1.9.noarch.rpm"
RPM_HASH = "a2238e2392940299682e840ae86520b498adac6a2630e0d475e6e5da8f87cf7cfd7aeb90808a4caf1c4cbf84e41c165d4eac095f999243b5a98bed9392a233d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "genius-lang \
genius-lang-all \
locale-genius-ar \
locale-genius-az \
locale-genius-bs \
locale-genius-ca \
locale-genius-cs \
locale-genius-da \
locale-genius-de \
locale-genius-dz \
locale-genius-el \
locale-genius-en-CA \
locale-genius-en-GB \
locale-genius-eo \
locale-genius-es \
locale-genius-eu \
locale-genius-fi \
locale-genius-fr \
locale-genius-ga \
locale-genius-gl \
locale-genius-hi \
locale-genius-hr \
locale-genius-hu \
locale-genius-id \
locale-genius-it \
locale-genius-ja \
locale-genius-ko \
locale-genius-lv \
locale-genius-mk \
locale-genius-ml \
locale-genius-nb \
locale-genius-ne \
locale-genius-nl \
locale-genius-oc \
locale-genius-pa \
locale-genius-pt \
locale-genius-pt-BR \
locale-genius-ro \
locale-genius-ru \
locale-genius-sl \
locale-genius-sq \
locale-genius-sr \
locale-genius-sr@latin \
locale-genius-sv \
locale-genius-uk \
locale-genius-zh-CN \
locale-genius-zh-TW"

RDEPENDS:${PN} += "genius"

inherit rpm
