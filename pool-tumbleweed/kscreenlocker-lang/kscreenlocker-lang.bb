SUMMARY = "Translations for package kscreenlocker"
DESCRIPTION = "Provides translations for the 'kscreenlocker' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "kscreenlocker-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "d5c8b19b43407f553bcb4326b7fc4947a37cad5b770c45d41958a185f4ec4308e23112f9202d24720d743a65a283011c61a3e96b1f2ad710b2ae5a43bb63aaf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kscreenlocker-lang \
kscreenlocker-lang-all \
locale-kscreenlocker-ar \
locale-kscreenlocker-az \
locale-kscreenlocker-bg \
locale-kscreenlocker-bs \
locale-kscreenlocker-ca \
locale-kscreenlocker-ca@valencia \
locale-kscreenlocker-cs \
locale-kscreenlocker-da \
locale-kscreenlocker-de \
locale-kscreenlocker-el \
locale-kscreenlocker-en-GB \
locale-kscreenlocker-es \
locale-kscreenlocker-et \
locale-kscreenlocker-eu \
locale-kscreenlocker-fi \
locale-kscreenlocker-fr \
locale-kscreenlocker-ga \
locale-kscreenlocker-gl \
locale-kscreenlocker-he \
locale-kscreenlocker-hi \
locale-kscreenlocker-hu \
locale-kscreenlocker-ia \
locale-kscreenlocker-id \
locale-kscreenlocker-it \
locale-kscreenlocker-ja \
locale-kscreenlocker-ka \
locale-kscreenlocker-kk \
locale-kscreenlocker-ko \
locale-kscreenlocker-lt \
locale-kscreenlocker-lv \
locale-kscreenlocker-ml \
locale-kscreenlocker-mr \
locale-kscreenlocker-nb \
locale-kscreenlocker-nds \
locale-kscreenlocker-nl \
locale-kscreenlocker-nn \
locale-kscreenlocker-pa \
locale-kscreenlocker-pl \
locale-kscreenlocker-pt \
locale-kscreenlocker-pt-BR \
locale-kscreenlocker-ro \
locale-kscreenlocker-ru \
locale-kscreenlocker-sk \
locale-kscreenlocker-sl \
locale-kscreenlocker-sr \
locale-kscreenlocker-sr@ijekavian \
locale-kscreenlocker-sr@ijekavianlatin \
locale-kscreenlocker-sr@latin \
locale-kscreenlocker-sv \
locale-kscreenlocker-ta \
locale-kscreenlocker-tr \
locale-kscreenlocker-ug \
locale-kscreenlocker-uk \
locale-kscreenlocker-wa \
locale-kscreenlocker-zh-CN \
locale-kscreenlocker-zh-TW"

RDEPENDS:${PN} += "kscreenlocker"

inherit rpm
