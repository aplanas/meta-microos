SUMMARY = "Control ligatures in Serbian"
DESCRIPTION = "The package suppresses fi and fl (and other ligatures) in \
Serbian text written using Roman script."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53127"

RPM_NAME = "texlive-serbian-lig-2023.201.svn53127-53.1.noarch.rpm"
RPM_HASH = "d3a8715885bf8b7229f57900aa054a84979a69209df1a5bd596a30865e2cc653ef1367997f7de706ff08b2f941f1a4b32f2fe3213c8fd213cea4f015abd87604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(serbian-lig.sty) \
texlive-serbian-lig"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
