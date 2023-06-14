SUMMARY = "Create some AmongUs characters in TikZ environments"
DESCRIPTION = "This package recreates some AmongUs characters in TikZ \
environments. Some interesting uses alongside other packages \
are also supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn60880"

RPM_NAME = "texlive-tikz-among-us-2023.201.1.2.0svn60880-54.1.noarch.rpm"
RPM_HASH = "d2f363152cc4944c4cbe7ad8b7787cf8457bbb25818c0eca70c2479f565e52900cb7c78568cbe250f919473cd98cbef17c8d70f685e14211715c6dda90467588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-among-us-fancyhdr.sty \
tex-tikz-among-us-watermark-eso-pic.sty \
tex-tikz-among-us.sty \
texlive-tikz-among-us"

RDEPENDS:${PN} += "/bin/sh \
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
