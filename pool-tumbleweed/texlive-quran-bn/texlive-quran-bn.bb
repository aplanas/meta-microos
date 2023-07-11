SUMMARY = "Bengali translations to the quran package"
DESCRIPTION = "The package is prepared for typesetting some Bengali \
translations of the Holy Quran. It adds two Bengali \
translations to the quran package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn57602"

RPM_NAME = "texlive-quran-bn-2023.201.0.0.1svn57602-53.2.noarch.rpm"
RPM_HASH = "c19b5fbbff6e1f683f10ee5d384bfc8a924d7904b0a114e1a97a84631f8d41698aad79c5e6ab18841b4040a55650d784e52bfe836ccab62afc4f6713d4654b21"
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
