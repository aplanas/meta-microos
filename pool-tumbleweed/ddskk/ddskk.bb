SUMMARY = "SKK (Simple Kana to Kanji Conversion Program) for Emacs"
DESCRIPTION = "SKK (Simple Kana to Kanji conversion program) is a Japanese input \
method for Emacs. ddskk (Daredevil SKK) is a version of SKK that is \
aggressively developed."
LICENSE = "GPL-2.0-or-later & SUSE-Permissive & SUSE-Public-Domain"

PV = "20160304"

RPM_NAME = "ddskk-20160304-3.10.noarch.rpm"
RPM_HASH = "6ffb4fdef4829d3f195f8c3cf88fae956a3e25d893084bd6e53d148e496d614e1a242b6884a8e7d0c12c1570d362df191764313ee60b05554f9e70c8ecd6eb09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-ddskk \
ddskk \
locale-emacs-ja"

RDEPENDS:${PN} += "/bin/sh \
apel \
emacs \
skkdic"

inherit rpm
