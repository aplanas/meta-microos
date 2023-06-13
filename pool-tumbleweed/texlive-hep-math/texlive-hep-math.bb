SUMMARY = "Extended math macros"
DESCRIPTION = "The hep-math package provides some additional features beyond \
the mathtools and amsmath packages. To use the package place \
\\usepackage{hep-math} in the preamble"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64905"

RPM_NAME = "texlive-hep-math-2023.201.1.1svn64905-53.1.noarch.rpm"
RPM_HASH = "5957997c457903e600a523608c9fd25254518e9e7ca4fba1a6a10e26b398d5f28426ab1cb2dbae2d565a40cb42c412605227132150ab44d4a219947ce2a26902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hep-math.sty) \
texlive-hep-math"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(cancel.sty) \
tex(etoolbox.sty) \
tex(mathtools.sty) \
tex(mleftright.sty) \
tex(slashed.sty) \
tex(soulutf8.sty) \
tex(units.sty) \
tex(xparse.sty) \
tex(xpatch.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
