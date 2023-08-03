SUMMARY = "A bibliography style with annotations"
DESCRIPTION = "The style is a derivative of the standard alpha style, which \
processes an entry's annotate field as part of the printed \
output."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn52824"

RPM_NAME = "texlive-annotate-2023.209.svn52824-55.1.noarch.rpm"
RPM_HASH = "387a6855ca02e1e688c44cf332a67e6b17aa377c836594231b98887da04bde2f4f3b08a044007332e466a22c998b4759b5eb08985f9f1ae5fd24e33ddd7e8a98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-annotate"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
