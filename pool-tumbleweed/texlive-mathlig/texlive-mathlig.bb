SUMMARY = "Define maths 'ligatures'"
DESCRIPTION = "The package defines character sequences that 'behave like' \
ligatures, in maths mode. Example definitions (chosen to show \
the package's flexibility, are: \\mathlig{->}{\\rightarrow} \
\\mathlig{<-}{\\leftarrow} \\mathlig{<->}{\\leftrightarrow}"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn54244"

RPM_NAME = "texlive-mathlig-2023.208.1.0svn54244-53.1.noarch.rpm"
RPM_HASH = "305a25d3249d34f7b1b61c4b0a1201f26151af3e341e64c24c2475e63a93568654356c60443d1eb485c275156bb005f4ece5fac2982ea2ee5048373fac604968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathlig.tex \
texlive-mathlig"

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
