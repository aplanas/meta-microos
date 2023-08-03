SUMMARY = "Convert common unicode symbols to LaTeX code"
DESCRIPTION = "The aim of this LaTeX package is to provide a complete as \
possible list of common Unicode symbols with their translations \
to LaTeX code. This is useful in the development of templates \
which are intended to work with modern TeX engines (LuaTeX, \
XeTeX) as well as traditional ones (TeX, pdfTeX)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn62901"

RPM_NAME = "texlive-commonunicode-2023.209.1.0.0svn62901-54.1.noarch.rpm"
RPM_HASH = "117f0c849fb824df0c334b2aaf1fcf5ee26db1913675c79e90cb5e6b01a6a2f2c6746c5b2c2d543fae1d6668624cd76ffb467c41f4c6bad05eafff359b2e59bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-commonunicode.sty \
texlive-commonunicode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amssymb.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-stmaryrd.sty \
tex-wasysym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
