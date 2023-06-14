SUMMARY = "Prettyprinting SuperCollider source code"
DESCRIPTION = "Built on top of the listings package, the package allows \
effortless prettyprinting of SuperCollider source code in \
documents typeset with LaTeX & friends."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn35087"

RPM_NAME = "texlive-sclang-prettifier-2023.201.0.0.1svn35087-53.1.noarch.rpm"
RPM_HASH = "12129e41d52bdc6eec412589282f72b91ba2ccca0558165ae47975510ebf8ad27bfd43426765a6bbfbf0127f8df33566b5f0eb53db8794f1d01e1a45ed909e56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sclang-prettifier.sty \
texlive-sclang-prettifier"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-textcomp.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
