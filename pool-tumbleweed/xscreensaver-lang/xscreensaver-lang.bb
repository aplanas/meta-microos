SUMMARY = "Translations for package xscreensaver"
DESCRIPTION = "Provides translations for the 'xscreensaver' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "6.06"

RPM_NAME = "xscreensaver-lang-6.06-4.4.noarch.rpm"
RPM_HASH = "52cf705ba9bd3c474a883ed62ae465aff22d1a7b60571ba296b07f50683a2f4364ca4520750f3d1411c2bf2b68d6b7d8c7a9039aa3dab2148cc638c52917c326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xscreensaver-da \
locale-xscreensaver-de \
locale-xscreensaver-es \
locale-xscreensaver-et \
locale-xscreensaver-fi \
locale-xscreensaver-fr \
locale-xscreensaver-hu \
locale-xscreensaver-it \
locale-xscreensaver-ja \
locale-xscreensaver-ko \
locale-xscreensaver-nb \
locale-xscreensaver-nl \
locale-xscreensaver-pl \
locale-xscreensaver-pt \
locale-xscreensaver-pt-BR \
locale-xscreensaver-ru \
locale-xscreensaver-sk \
locale-xscreensaver-sv \
locale-xscreensaver-vi \
locale-xscreensaver-wa \
locale-xscreensaver-zh-CN \
locale-xscreensaver-zh-TW \
xscreensaver-lang \
xscreensaver-lang-all"

RDEPENDS:${PN} += "xscreensaver"

inherit rpm
