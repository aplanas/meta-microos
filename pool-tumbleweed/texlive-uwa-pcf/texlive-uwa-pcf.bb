SUMMARY = "A Participant Consent Form (PCF) for a human research protocol at the University of Western Australia"
DESCRIPTION = "This LaTeX class generates a Participant Consent Form (PCF) for \
a human research protocol at the University of Western \
Australia. It requires the UWA logo in PDF format, which is \
available in SVG format at \
https://static-listing.weboffice.uwa.edu.au/visualid/core-rebra \
nd/img/uwacrest/, and uses the Arial and UWA Slab fonts by \
default. The class works with XeLaTeX and LuaLaTeX. It depends \
on the uwa-letterhead package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn64491"

RPM_NAME = "texlive-uwa-pcf-2023.201.1.0.1svn64491-53.1.noarch.rpm"
RPM_HASH = "2f5ee61752e2bdc253d1f3fb34c492ae0696669363c99fbf16957a19d82ace4fe7234096e1f1bd318b41506c3c4c6ff1562ed069ffc2da65b01d9dad5bc285d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uwa-pcf.cls \
texlive-uwa-pcf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-article.cls \
tex-fontspec.sty \
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
