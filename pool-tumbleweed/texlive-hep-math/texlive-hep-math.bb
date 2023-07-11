SUMMARY = "Extended math macros"
DESCRIPTION = "The hep-math package provides some additional features beyond \
the mathtools and amsmath packages. To use the package place \
\\usepackage{hep-math} in the preamble"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64905"

RPM_NAME = "texlive-hep-math-2023.201.1.1svn64905-53.2.noarch.rpm"
RPM_HASH = "62b62a3b53c515f494b84239552e20b0e996bccef43b020ae2d071fb4a979bf8f6630d6495279bd24492ffd1d326f41244406c6ee8295b26466ff8d546acf6f1"
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
