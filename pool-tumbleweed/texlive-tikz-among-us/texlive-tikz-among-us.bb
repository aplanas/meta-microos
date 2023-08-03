SUMMARY = "Create some AmongUs characters in TikZ environments"
DESCRIPTION = "This package recreates some AmongUs characters in TikZ \
environments. Some interesting uses alongside other packages \
are also supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn60880"

RPM_NAME = "texlive-tikz-among-us-2023.209.1.2.0svn60880-55.1.noarch.rpm"
RPM_HASH = "9cf693896656156bb5a6f2deca4bc9ced62f02c0886a44d6338ce146cfaca7062ce340b0f0e2bb1a8caa09ad5e5ec3c9e7aa3dd878dab10d30f07527a0e2f82e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-among-us-fancyhdr.sty \
tex-tikz-among-us-watermark-eso-pic.sty \
tex-tikz-among-us.sty \
texlive-tikz-among-us"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-kvoptions.sty \
tex-tikz.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
