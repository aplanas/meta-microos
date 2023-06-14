SUMMARY = "Define your own verbatim-like environment"
DESCRIPTION = "Defines general purpose macro named \\newverbatim to define your \
own verbatim-like environment. It also has a supplementary \
style file varvbtm.sty to provide set of macros for variants of \
verbatim, such as tab emulation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn23996"

RPM_NAME = "texlive-newvbtm-2023.201.1.1svn23996-54.1.noarch.rpm"
RPM_HASH = "4dd79032652b3a73a05c5b4431c89e25700a08fe754b0d22ce42f7b3b1dcd5355ec1254747f5679c0071e37e8c18eab9411831c8033b0704944868ff58a11f18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newvbtm.sty \
tex-varvbtm.sty \
texlive-newvbtm"

RDEPENDS:${PN} += "/bin/sh \
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
