SUMMARY = "German translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some German \
translations of the Holy Quran. It adds three more German \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn54191"

RPM_NAME = "texlive-quran-de-2023.201.0.0.2svn54191-53.1.noarch.rpm"
RPM_HASH = "bf3a54d682ed2f1e130f7486bc98ee63af7c31e4941d7cf8327e62715b78b7f4668f774f1bbdd00734b5c1230a1dc5346585316bb38d0a2e186f7a593cc04a2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-de.sty \
tex-qurantext-deii.translation.def \
tex-qurantext-deiii.translation.def \
tex-qurantext-deiv.translation.def \
texlive-quran-de"

RDEPENDS:${PN} += "/bin/sh \
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
