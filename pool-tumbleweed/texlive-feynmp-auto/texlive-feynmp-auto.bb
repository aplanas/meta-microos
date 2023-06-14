SUMMARY = "Automatic processing of feynmp graphics"
DESCRIPTION = "The package takes care of running Metapost on the output files \
produced by the feynmp package, so that the compiled pictures \
will be available in the next run of LaTeX. The package honours \
options that apply to feynmp."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn30223"

RPM_NAME = "texlive-feynmp-auto-2023.201.1.1svn30223-52.1.noarch.rpm"
RPM_HASH = "c90c554c202a31fb766e3ecee323e0404b66f035ed68fb2a3f3e587d7872f93fd36c2790198780c0ff12a3cffc30ed136dc2fc31e2dd8878e3b987a2731b4c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-feynmp-auto.sty \
texlive-feynmp-auto"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-feynmp.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
