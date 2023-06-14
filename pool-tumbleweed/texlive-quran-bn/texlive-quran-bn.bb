SUMMARY = "Bengali translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some Bengali \
translations of the Holy Quran. It adds two Bengali \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn57602"

RPM_NAME = "texlive-quran-bn-2023.201.0.0.1svn57602-53.1.noarch.rpm"
RPM_HASH = "13ab3ded0673291d6b029bcc74d6ec9a07083249e283e2e33852daac224d1cbd55693e9417106ad3a43143bc90afcce335e4df60627fae964f6f9466aceb3582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-bn.sty \
tex-qurantext-bni.translation.def \
tex-qurantext-bnii.translation.def \
texlive-quran-bn"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
tex-quran.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
