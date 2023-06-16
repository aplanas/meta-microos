SUMMARY = "Manage footnote marks' interaction with punctuation"
DESCRIPTION = "The package moves footnote marks after following punctuation \
(comma or full stop), and adjusts kerning as appropriate. As a \
side effect, a change to the handling of multiple footnotes is \
provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn62248"

RPM_NAME = "texlive-fnpct-2023.201.1.1asvn62248-52.1.noarch.rpm"
RPM_HASH = "c17000c0139f97b1a16fd689975bc113146494707c9b2283aa13889e37a3704cf72a788d1c15e1ef110902ba5374a256f3fd2c877b3c9163e0692d5c51b62e5b"
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
