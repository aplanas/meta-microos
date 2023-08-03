SUMMARY = "Inhibit use of non-amsmath mathematics markup when using amsmath"
DESCRIPTION = "This package inhibits the usage of plain TeX and (on demand) of \
standard LaTeX mathematics environments. This is useful for \
class writers who want to encourage their users to use the \
environments provided by the amsmath package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.20svn42927"

RPM_NAME = "texlive-onlyamsmath-2023.209.0.0.20svn42927-55.1.noarch.rpm"
RPM_HASH = "be637b9c6d656e846d4f7fa84bc75f9489a6e0ac4d593b98bf2133b83b773fdea494cdad27aef4ab95ef90ee6f5aa155d7e7b85fb4ba2fc8582a6cab64a8ba44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-onlyamsmath.sty \
texlive-onlyamsmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
