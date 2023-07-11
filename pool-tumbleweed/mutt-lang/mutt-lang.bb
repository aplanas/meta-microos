SUMMARY = "Languages for Mutt"
DESCRIPTION = "Provides translations to the package mutt."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.10"

RPM_NAME = "mutt-lang-2.2.10-2.2.noarch.rpm"
RPM_HASH = "62f14fd092c1c33b516896c84e199e4903e33d82d1593947aca3d7547f5bfaebdb54baa2644b8cff2d1c0efe38c4f13ece37d8f11f1851f9f4d5badea81547e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mutt-bg \
locale-mutt-ca \
locale-mutt-cs \
locale-mutt-da \
locale-mutt-de \
locale-mutt-el \
locale-mutt-eo \
locale-mutt-es \
locale-mutt-et \
locale-mutt-eu \
locale-mutt-fi \
locale-mutt-fr \
locale-mutt-ga \
locale-mutt-gl \
locale-mutt-hu \
locale-mutt-id \
locale-mutt-it \
locale-mutt-ja \
locale-mutt-ko \
locale-mutt-lt \
locale-mutt-nl \
locale-mutt-pl \
locale-mutt-pt-BR \
locale-mutt-ru \
locale-mutt-sk \
locale-mutt-sv \
locale-mutt-tr \
locale-mutt-uk \
locale-mutt-zh-CN \
locale-mutt-zh-TW \
mutt-/usr/share/locale/en-GB/LC-MESSAGES/mutt.mo \
mutt-lang"

RDEPENDS:${PN} += "mutt"

inherit rpm
