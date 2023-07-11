SUMMARY = "German translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some German \
translations of the Holy Quran. It adds three more German \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn54191"

RPM_NAME = "texlive-quran-de-2023.201.0.0.2svn54191-53.2.noarch.rpm"
RPM_HASH = "2d25eb35479efe0d51836cda25f0a98fac422f54ca2caec4e0adfa1de593e4bf499f6d77276132b44743dad6812079f68dcfc6849ec600cbea1665ec02498d3a"
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
