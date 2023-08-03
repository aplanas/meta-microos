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

PV = "2023.209.1.3.6svn60322"

RPM_NAME = "texlive-polski-2023.209.1.3.6svn60322-53.1.noarch.rpm"
RPM_HASH = "5ca5509d4ec35ba0446035816e73106e77c659c0c2b8995c49ef3d62dc69adac165224ed0a23c904da77cdb874cf37efbaebc19180fc88edbb84e05cf47a1713"
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

RDEPENDS:${PN} += "/usr/bin/sh \
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
