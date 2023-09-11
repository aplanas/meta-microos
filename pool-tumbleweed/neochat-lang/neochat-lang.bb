SUMMARY = "Translations for package neochat"
DESCRIPTION = "Provides translations for the 'neochat' package."
LICENSE = "BSD-2-Clause & GPL-3.0-only & GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "neochat-lang-23.08.0-2.1.noarch.rpm"
RPM_HASH = "af7d95163d7435dedb48785556fcfb91d851601aed3415f9987485fb2deba05e5436497309adcd6f95bffd944a4c0eedc7310e6385413ebdebb9b34336034ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-neochat-ar \
locale-neochat-az \
locale-neochat-ca \
locale-neochat-ca@valencia \
locale-neochat-cs \
locale-neochat-da \
locale-neochat-de \
locale-neochat-el \
locale-neochat-en-GB \
locale-neochat-es \
locale-neochat-eu \
locale-neochat-fi \
locale-neochat-fr \
locale-neochat-hu \
locale-neochat-ia \
locale-neochat-id \
locale-neochat-it \
locale-neochat-ja \
locale-neochat-ka \
locale-neochat-ko \
locale-neochat-lt \
locale-neochat-nl \
locale-neochat-nn \
locale-neochat-pa \
locale-neochat-pl \
locale-neochat-pt \
locale-neochat-pt-BR \
locale-neochat-ru \
locale-neochat-sk \
locale-neochat-sl \
locale-neochat-sv \
locale-neochat-ta \
locale-neochat-tr \
locale-neochat-uk \
locale-neochat-zh-CN \
locale-neochat-zh-TW \
neochat-lang \
neochat-lang-all"

RDEPENDS:${PN} += "neochat"

inherit rpm
