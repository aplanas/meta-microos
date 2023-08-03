SUMMARY = "SAS(R) user group conference proceedings document class"
DESCRIPTION = "The class may be used to typeset articles to be published in \
the proceedings of SAS(R) User group conferences and workshops. \
The layout produced by the class is based on that published by \
SAS Institute (2021)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58752"

RPM_NAME = "texlive-sugconf-2023.209.svn58752-58.1.noarch.rpm"
RPM_HASH = "285cf707a6a6dbd23cb19b190947d1cc92c76660d69073b7114342e77ac201db129469cd765fa51d8a11a16367def98ac9ff17ad3fe4a66aa60315b728b9e3c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sugconf.cls \
texlive-sugconf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-fontenc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
