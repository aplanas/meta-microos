SUMMARY = "Automatic processing of feynmp graphics"
DESCRIPTION = "The package takes care of running Metapost on the output files \
produced by the feynmp package, so that the compiled pictures \
will be available in the next run of LaTeX. The package honours \
options that apply to feynmp."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn30223"

RPM_NAME = "texlive-feynmp-auto-2023.209.1.1svn30223-53.1.noarch.rpm"
RPM_HASH = "8ffbc594254e4087c33ee602d97f3969b495cddaef32f811b33bb745268786105787dd5d4a1add51eedff645959adf3062bd88dbad37dad8a4703881aa90c50e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-feynmp-auto.sty \
texlive-feynmp-auto"

RDEPENDS:${PN} += "/usr/bin/sh \
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
