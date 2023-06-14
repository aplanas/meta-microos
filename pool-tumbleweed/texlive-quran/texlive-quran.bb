SUMMARY = "An easy way to typeset any part of The Holy Quran"
DESCRIPTION = "This package offers the user an easy way to typeset The Holy \
Quran. It has been inspired by the lipsum and ptext packages \
and provides several macros for typesetting the whole or any \
part of the Quran based on its popular division, including \
surah, ayah, juz, hizb, quarter, and page. Besides the Arabic \
original, translations to English, German, French, and Persian \
are provided, as well as an English transliteration."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.81svn57601"

RPM_NAME = "texlive-quran-2023.201.1.81svn57601-53.1.noarch.rpm"
RPM_HASH = "c1aa447050a6f5dd435374c9e5cbf3ae69c7e6b98b35e5908776acf67a82d7a20445b261e2b66fb004c0a17c7c3593ec0a587cd4caac18cad018e483dd69b01e"
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

RDEPENDS:${PN} += "/bin/sh \
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
