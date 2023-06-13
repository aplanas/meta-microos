SUMMARY = "Attach superior figures to a font family"
DESCRIPTION = "The package allows the attachment of an arbitrary superior \
figures font to a font family that lacks one. (Superior figures \
are commonly used as footnote markers.) Two superior figures \
fonts are provided--one matching Times, the other matching \
Libertine."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn51909"

RPM_NAME = "texlive-superiors-2023.201.1.06svn51909-57.1.noarch.rpm"
RPM_HASH = "c71f835246e9bd7dd0e81b7226399f9ad9f9995112cad338b3152a58d31a60b47f366597703e2b63c1a54d0a3547fc0b8848ca3652f26cc5acaf7de052e7ff06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(libertinesups.tfm) \
tex(superiors.map) \
tex(superiors.sty) \
tex(sups.enc) \
texlive-superiors"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontenc.sty) \
tex(pgffor.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-superiors-fonts"

inherit rpm
