SUMMARY = "German translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some German \
translations of the Holy Quran. It adds three more German \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn54191"

RPM_NAME = "texlive-quran-de-2023.209.0.0.2svn54191-54.2.noarch.rpm"
RPM_HASH = "1cf6a2081106374ccf08373bb82850da7b75feeec4a88dc819c5963d4a61a65fd400106df3ef7455bf604865f3e5c7a5eddf29953de226efa02ecf991b5727d7"
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
