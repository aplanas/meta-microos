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

PV = "2023.209.1.0.1svn64491"

RPM_NAME = "texlive-uwa-pcf-2023.209.1.0.1svn64491-54.1.noarch.rpm"
RPM_HASH = "526591cdafd1ac0bdd9ef191fe5a55866307d7acf8cee31fbb5774dcf84a5eb4635b373b045b3fa3a91b9403e3c025e52a9d1e67ea2107b91ade085694835abb"
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
