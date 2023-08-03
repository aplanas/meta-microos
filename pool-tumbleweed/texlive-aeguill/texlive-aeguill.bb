SUMMARY = "Add several kinds of guillemets to the ae fonts"
DESCRIPTION = "The package enables the user to add guillemets from several \
source (Polish cmr, Cyrillic cmr, lasy and ec) to the ae fonts. \
This was useful when the ae fonts were used to produce PDF \
files, since the additional guillemets exist in fonts available \
in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-aeguill-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "af66d14cc7fbb86daa67670a7b51c4a19607c1439d7152a00b7c74e125cfb0a0f1c556613e5b26202860f29943ea1f6f0bcf2c784c735a7df72f12839d8a5be3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aeguill.sty \
texlive-aeguill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ae.sty \
tex-fontenc.sty \
tex-latexsym.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
