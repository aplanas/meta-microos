SUMMARY = "Manage footnote marks' interaction with punctuation"
DESCRIPTION = "The package moves footnote marks after following punctuation \
(comma or full stop), and adjusts kerning as appropriate. As a \
side effect, a change to the handling of multiple footnotes is \
provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn62248"

RPM_NAME = "texlive-fnpct-2023.209.1.1asvn62248-53.1.noarch.rpm"
RPM_HASH = "0253a1b350651f52f0d1279da13646e0e3d6c75024a948a3a130c74fd41ef2b870ebcd68c5f288217c5472e095d91c9739940ca8917f593095cd55b55fb22f64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fnpct-2019-10-05.sty \
tex-fnpct.sty \
texlive-fnpct"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-scrextend.sty \
tex-scrlfile.sty \
tex-translations.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
