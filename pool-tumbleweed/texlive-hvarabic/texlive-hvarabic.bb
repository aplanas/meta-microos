SUMMARY = "Macros for RTL typesetting"
DESCRIPTION = "This package provides some macros for right-to-left \
typesetting. It uses by default the arabic fonts Scheherazade \
and ALM fixed, the only monospaced arabic font. The package \
works with LuaLaTeX or XeLaTeX, but not with pdfLaTeX or latex."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn59423"

RPM_NAME = "texlive-hvarabic-2023.209.0.0.02svn59423-54.1.noarch.rpm"
RPM_HASH = "a5bd50f9314a7c923a559af1e51d10b259bb9d83fa34ca06f6d68cd4edde046cbfa1acd1f1aa4611a89683e0ecdf09017fd4027365c62b5945925ea42a250207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hvarabic.sty \
texlive-hvarabic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
