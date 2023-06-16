SUMMARY = "A Participant Information Form (PIF) for a human research protocol at the University of Western Australia"
DESCRIPTION = "This package generates a Participant Information Form (PIF) for \
a human research protocol at the University of Western \
Australia. It requires the UWA logo in PDF format, which is \
available in SVG format at \
https://static-listing.weboffice.uwa.edu.au/visualid/core-rebra \
nd/img/uwacrest/, and uses the Calibri fonts by default. The \
class works with XeLaTeX and LuaLaTeX. It depends on the \
uwa-letterhead package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn64491"

RPM_NAME = "texlive-uwa-pif-2023.201.1.0.1svn64491-53.1.noarch.rpm"
RPM_HASH = "901fe5b4d987a5ed9cbf2e702418311d2be4d70441531f04e9c90725fcc4d838a3d59a7c1bb5b3855eb7048cadf1f9354358a317713312fa05bfd98ea55dc726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwa-pif.cls \
texlive-uwa-pif"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-article.cls \
tex-fontspec.sty \
tex-setspace.sty \
tex-titlesec.sty \
tex-uwa-letterhead.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
