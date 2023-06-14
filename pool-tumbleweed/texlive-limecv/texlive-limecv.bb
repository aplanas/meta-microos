SUMMARY = "A (Xe/Lua)LaTeX document class for curriculum vitae"
DESCRIPTION = "limecv is a (Xe/Lua)LaTeX document class to write curriculum \
vitae. It is designed with the following design rules: simple, \
elegant and clean. To this end, it offers several environments \
and macros for convenience."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.12svn61199"

RPM_NAME = "texlive-limecv-2023.201.0.0.1.12svn61199-54.1.noarch.rpm"
RPM_HASH = "ae77299d2e33129d750e97c67244caf440a6b9b845aa0fe62a813a39f76f4de679de01b430fcc2b026412503959229745bbd7e602f5f8fe38ba670886a627f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-limecv.cls \
texlive-limecv"

RDEPENDS:${PN} += "/bin/sh \
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
