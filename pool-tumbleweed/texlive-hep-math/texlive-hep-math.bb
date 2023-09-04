SUMMARY = "Extended math macros"
DESCRIPTION = "The hep-math package provides some additional features beyond \
the mathtools and amsmath packages. To use the package place \
\\usepackage{hep-math} in the preamble"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64905"

RPM_NAME = "texlive-hep-math-2023.209.1.1svn64905-54.2.noarch.rpm"
RPM_HASH = "f58c01e5f5f93d38663eeb3bd75213cfc40d8d9947725dd9b3292642fefc2060b1c51d355423980df0e675ab04b49b410b5da0c77fb2080e7113b6f6d1e6c3be"
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
