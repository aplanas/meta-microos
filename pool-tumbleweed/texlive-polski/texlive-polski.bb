SUMMARY = "Typeset Polish documents with LaTeX and Polish fonts"
DESCRIPTION = "Tools to typeset monolingual Polish documents in LaTeX2e \
without babel or polyglossia. The package loads Polish \
hyphenation patterns, ensures that a font encoding suitable for \
Polish is used; in particular it enables Polish adaptation of \
Computer Modern fonts (the so-called PL fonts), provides \
translations of \\today and names like 'Bibliography' or \
'Chapter', redefines math symbols according to Polish \
typographical tradition, provides macros for dashes according \
to Polish orthography, provides a historical input method for \
'Polish characters', works with traditional TeX as well as with \
Unicode aware variants. (This package was previously known as \
platex, but has been renamed to resolve a name clash.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.6svn60322"

RPM_NAME = "texlive-polski-2023.201.1.3.6svn60322-52.1.noarch.rpm"
RPM_HASH = "88d620d60b7ec859d437c2cc574849160d1167deea72c511586bdaa15fec1e9884b12a2db018af166eee606625330639272499fad1e1a8230590fce689c26201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amigapl.def \
tex-mazovia.def \
tex-omlplcm.fd \
tex-omlplm.fd \
tex-omsplsy.fd \
tex-omxplex.fd \
tex-ot1patch.sty \
tex-ot4ccr.fd \
tex-ot4cmdh.fd \
tex-ot4cmfib.fd \
tex-ot4cmfr.fd \
tex-ot4cmr.fd \
tex-ot4cmss.fd \
tex-ot4cmtt.fd \
tex-plprefix.sty \
tex-polski.sty \
tex-qxenc.def \
texlive-polski"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ot4enc.def \
texlive \
texlive-filesystem \
texlive-hyphen-polish \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pl \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
