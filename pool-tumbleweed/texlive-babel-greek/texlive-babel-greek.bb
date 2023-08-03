SUMMARY = "Babel support for documents written in Greek"
DESCRIPTION = "The file provides modes for monotonic (single-diacritic) and \
polytonic (multiple-diacritic) modes of writing. Provision is \
made for Greek function names in mathematics, and for \
classical-era symbols."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn66346"

RPM_NAME = "texlive-babel-greek-2023.209.1.12svn66346-54.1.noarch.rpm"
RPM_HASH = "a47798c084bf83ff0637243abc4dd639a7d919f94631c84a444fe23e70dfced161b34064eacff2be333d301532371e2453772b2926d8ec5b1ecb77660f08fc2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-athnum.sty \
tex-greek.ldf \
tex-grmath.sty \
texlive-babel-greek"

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
