SUMMARY = "Bengali translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some Bengali \
translations of the Holy Quran. It adds two Bengali \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn57602"

RPM_NAME = "texlive-quran-bn-2023.209.0.0.1svn57602-54.1.noarch.rpm"
RPM_HASH = "3d77135ff9fd8260c51d13b5aa3e57458b623236e79b9cf3e48ccc2270a1a36f416d51f7b27546d087f522c3e2daa9a2795528b7b1718cfd2f6191ea47d82488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-bn.sty \
tex-qurantext-bni.translation.def \
tex-qurantext-bnii.translation.def \
texlive-quran-bn"

RDEPENDS:${PN} += "/usr/bin/sh \
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
