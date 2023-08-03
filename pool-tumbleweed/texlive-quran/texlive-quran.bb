SUMMARY = "An easy way to typeset any part of The Holy Quran"
DESCRIPTION = "This package offers the user an easy way to typeset The Holy \
Quran. It has been inspired by the lipsum and ptext packages \
and provides several macros for typesetting the whole or any \
part of the Quran based on its popular division, including \
surah, ayah, juz, hizb, quarter, and page. Besides the Arabic \
original, translations to English, German, French, and Persian \
are provided, as well as an English transliteration."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.81svn57601"

RPM_NAME = "texlive-quran-2023.209.1.81svn57601-54.1.noarch.rpm"
RPM_HASH = "a04d40d4347247c85d199f194d2d054d57fd5f3975c5c52d1b22225247a1b9b254c78ee1402096c9083ccd4d23fbbf7b0c1eb32468c8750696ee9db4727ca732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quran-transde.def \
tex-quran-transen.def \
tex-quran-transfa.def \
tex-quran-transfr.def \
tex-quran-translt.def \
tex-quran.sty \
tex-qurantext-de.translation.def \
tex-qurantext-en.translation.def \
tex-qurantext-en.transliteration.def \
tex-qurantext-fa.translation.def \
tex-qurantext-fr.translation.def \
tex-qurantext-simple.def \
tex-qurantext-uthmani-min.def \
tex-qurantext-uthmani.def \
texlive-quran"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
tex-ifxetex.sty \
tex-listofitems.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
