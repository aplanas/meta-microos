SUMMARY = "Macros to change text and mathematics fonts in plain TeX"
DESCRIPTION = "Macros to Change Text and Mathematics fonts in TeX: 45 \
Beautiful Variants The macros are written for plain TeX and may \
be used with other packages like AmSTeX, eplain, etc. They also \
work with XeTeX. The macros allow users to change the fonts \
(for both text and mathematics) in their TeX document with only \
one statement. The fonts may be used readily at various \
predefined sizes. All the fonts called by these macro files are \
free and are included in current MiKTeX and TeX Live \
distributions."
LICENSE = "LPPL-1.0"

PV = "2023.201.2015.2svn40403"

RPM_NAME = "texlive-font-change-2023.201.2015.2svn40403-52.1.noarch.rpm"
RPM_HASH = "59eb06e772d73b4591fd6e279471422ceaec791d4beb900cb29f355a770009951680b93034d6a991b4b9f8471b5c5497887e3b808aa58b9235b1580e19d0172a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(default-amssymbols.tex) \
tex(font_antp_euler.tex) \
tex(font_antt-condensed-light.tex) \
tex(font_antt-condensed-medium.tex) \
tex(font_antt-condensed.tex) \
tex(font_antt-light.tex) \
tex(font_antt-medium.tex) \
tex(font_antt.tex) \
tex(font_arev.tex) \
tex(font_artemisia_euler.tex) \
tex(font_bera_concrete.tex) \
tex(font_bera_euler.tex) \
tex(font_bera_fnc.tex) \
tex(font_bookman.tex) \
tex(font_century.tex) \
tex(font_charter.tex) \
tex(font_cm.tex) \
tex(font_cmbright.tex) \
tex(font_concrete.tex) \
tex(font_epigrafica_euler.tex) \
tex(font_epigrafica_palatino.tex) \
tex(font_iwona-bold.tex) \
tex(font_iwona-condensed-bold.tex) \
tex(font_iwona-condensed-light.tex) \
tex(font_iwona-condensed-medium.tex) \
tex(font_iwona-condensed.tex) \
tex(font_iwona-light.tex) \
tex(font_iwona-medium.tex) \
tex(font_iwona.tex) \
tex(font_kp-light.tex) \
tex(font_kp.tex) \
tex(font_kurier-bold.tex) \
tex(font_kurier-condensed-bold.tex) \
tex(font_kurier-condensed-light.tex) \
tex(font_kurier-condensed-medium.tex) \
tex(font_kurier-condensed.tex) \
tex(font_kurier-light.tex) \
tex(font_kurier-medium.tex) \
tex(font_kurier.tex) \
tex(font_libertine_kp.tex) \
tex(font_libertine_palatino.tex) \
tex(font_libertine_times.tex) \
tex(font_mdutopia.tex) \
tex(font_pagella.tex) \
tex(font_palatino.tex) \
tex(font_times.tex) \
tex(font_utopia.tex) \
texlive-font-change"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
