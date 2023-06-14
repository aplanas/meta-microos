SUMMARY = "Translations for package gnome-taquin"
DESCRIPTION = "Provides translations for the 'gnome-taquin' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.1"

RPM_NAME = "gnome-taquin-lang-3.38.1-2.12.noarch.rpm"
RPM_HASH = "5bc4963c5fdb4b773a78ca531a95b84d8c47d10b018dfe838162bea446aeeee77084103c7670caa91bebe4f0da2eae765def82e1899d07a1141eb54fb3e83f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-taquin-lang \
gnome-taquin-lang-all \
locale-gnome-taquin-bg \
locale-gnome-taquin-bs \
locale-gnome-taquin-ca \
locale-gnome-taquin-ca@valencia \
locale-gnome-taquin-cs \
locale-gnome-taquin-da \
locale-gnome-taquin-de \
locale-gnome-taquin-el \
locale-gnome-taquin-en-GB \
locale-gnome-taquin-eo \
locale-gnome-taquin-es \
locale-gnome-taquin-eu \
locale-gnome-taquin-fa \
locale-gnome-taquin-fi \
locale-gnome-taquin-fr \
locale-gnome-taquin-fur \
locale-gnome-taquin-gl \
locale-gnome-taquin-he \
locale-gnome-taquin-hr \
locale-gnome-taquin-hu \
locale-gnome-taquin-id \
locale-gnome-taquin-it \
locale-gnome-taquin-kk \
locale-gnome-taquin-ko \
locale-gnome-taquin-lt \
locale-gnome-taquin-lv \
locale-gnome-taquin-ml \
locale-gnome-taquin-ms \
locale-gnome-taquin-nb \
locale-gnome-taquin-ne \
locale-gnome-taquin-nl \
locale-gnome-taquin-oc \
locale-gnome-taquin-pa \
locale-gnome-taquin-pl \
locale-gnome-taquin-pt \
locale-gnome-taquin-pt-BR \
locale-gnome-taquin-ro \
locale-gnome-taquin-ru \
locale-gnome-taquin-sk \
locale-gnome-taquin-sl \
locale-gnome-taquin-sr \
locale-gnome-taquin-sr@latin \
locale-gnome-taquin-sv \
locale-gnome-taquin-tr \
locale-gnome-taquin-uk \
locale-gnome-taquin-vi \
locale-gnome-taquin-zh-CN \
locale-gnome-taquin-zh-HK \
locale-gnome-taquin-zh-TW"

RDEPENDS:${PN} += "gnome-taquin"

inherit rpm
