SUMMARY = "Extended math macros"
DESCRIPTION = "The hep-math package provides some additional features beyond \
the mathtools and amsmath packages. To use the package place \
\\usepackage{hep-math} in the preamble"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64905"

RPM_NAME = "texlive-hep-math-2023.209.1.1svn64905-54.1.noarch.rpm"
RPM_HASH = "e0ee1a8e2ecd0aa153d6bc2c1826625ef5a4126a81cc9940d414a448e5cea9a65c43b168509d098cb60300e4f0e459d2cf6d32d48b1dfb8e5dfd10ef86d62292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-math.sty \
texlive-hep-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-cancel.sty \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-mleftright.sty \
tex-slashed.sty \
tex-soulutf8.sty \
tex-units.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
