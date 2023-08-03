SUMMARY = "A (Xe/Lua)LaTeX document class for curriculum vitae"
DESCRIPTION = "limecv is a (Xe/Lua)LaTeX document class to write curriculum \
vitae. It is designed with the following design rules: simple, \
elegant and clean. To this end, it offers several environments \
and macros for convenience."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.12svn61199"

RPM_NAME = "texlive-limecv-2023.209.0.0.1.12svn61199-55.1.noarch.rpm"
RPM_HASH = "b94e4f80d4e57abb0c3fed397c4581106b9f48e2a3b3517257ee258c3e625d6e12a80d20e3405f205b719a8ac2208d07677c3992d4f034dc8b0222b23269a33b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-limecv.cls \
texlive-limecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-fontawesome5.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-parskip.sty \
tex-tabularx.sty \
tex-tikz.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xeCJK.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
