SUMMARY = "German translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some German \
translations of the Holy Quran. It adds three more German \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn54191"

RPM_NAME = "texlive-quran-de-2023.209.0.0.2svn54191-54.1.noarch.rpm"
RPM_HASH = "3865bfd252bf0f25f2fb38592d7e44e7b4efb5be286bdffb5477391e53e0dd053950f13c432da7953155e01e8a360ba27c2aa57bcf5ac2d5d66b0df20069a0aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-de.sty \
tex-qurantext-deii.translation.def \
tex-qurantext-deiii.translation.def \
tex-qurantext-deiv.translation.def \
texlive-quran-de"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-quran.sty \
tex-qurantext-de.translation.def \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
