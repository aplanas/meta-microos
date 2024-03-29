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

PV = "2023.209.2015.2svn40403"

RPM_NAME = "texlive-font-change-2023.209.2015.2svn40403-53.1.noarch.rpm"
RPM_HASH = "67f7d2f349629ed6ee2d62f4e6f7f5536759530f89c9eae5b403ff033237bb5b086818189391e799605b3e3b6d831501a0c4d07c48903f0c6deb74e1099e206f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-default-amssymbols.tex \
tex-font-antp-euler.tex \
tex-font-antt-condensed-light.tex \
tex-font-antt-condensed-medium.tex \
tex-font-antt-condensed.tex \
tex-font-antt-light.tex \
tex-font-antt-medium.tex \
tex-font-antt.tex \
tex-font-arev.tex \
tex-font-artemisia-euler.tex \
tex-font-bera-concrete.tex \
tex-font-bera-euler.tex \
tex-font-bera-fnc.tex \
tex-font-bookman.tex \
tex-font-century.tex \
tex-font-charter.tex \
tex-font-cm.tex \
tex-font-cmbright.tex \
tex-font-concrete.tex \
tex-font-epigrafica-euler.tex \
tex-font-epigrafica-palatino.tex \
tex-font-iwona-bold.tex \
tex-font-iwona-condensed-bold.tex \
tex-font-iwona-condensed-light.tex \
tex-font-iwona-condensed-medium.tex \
tex-font-iwona-condensed.tex \
tex-font-iwona-light.tex \
tex-font-iwona-medium.tex \
tex-font-iwona.tex \
tex-font-kp-light.tex \
tex-font-kp.tex \
tex-font-kurier-bold.tex \
tex-font-kurier-condensed-bold.tex \
tex-font-kurier-condensed-light.tex \
tex-font-kurier-condensed-medium.tex \
tex-font-kurier-condensed.tex \
tex-font-kurier-light.tex \
tex-font-kurier-medium.tex \
tex-font-kurier.tex \
tex-font-libertine-kp.tex \
tex-font-libertine-palatino.tex \
tex-font-libertine-times.tex \
tex-font-mdutopia.tex \
tex-font-pagella.tex \
tex-font-palatino.tex \
tex-font-times.tex \
tex-font-utopia.tex \
texlive-font-change"

RDEPENDS:${PN} += "/usr/bin/sh \
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
