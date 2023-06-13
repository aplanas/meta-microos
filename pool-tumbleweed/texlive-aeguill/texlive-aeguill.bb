SUMMARY = "Add several kinds of guillemets to the ae fonts"
DESCRIPTION = "The package enables the user to add guillemets from several \
source (Polish cmr, Cyrillic cmr, lasy and ec) to the ae fonts. \
This was useful when the ae fonts were used to produce PDF \
files, since the additional guillemets exist in fonts available \
in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-aeguill-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "6c1eddec7096174bc003f49b00af0c72e1bb91d3136618c67987fe5397e00d79aa4d0757f4424b05f6137f56de4fe95babcc1f3cabb177b53ab315f81bb71032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(aeguill.sty) \
texlive-aeguill"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ae.sty) \
tex(fontenc.sty) \
tex(latexsym.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
