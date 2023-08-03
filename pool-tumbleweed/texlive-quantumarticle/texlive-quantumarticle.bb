SUMMARY = "Document class for submissions to the Quantum journal"
DESCRIPTION = "This package provides the preferred document class for papers \
to be submitted to 'Quantum -- the open journal of quantum \
science'. It is based on the widely used article document class \
and designed to allow a seamless transition from documents \
typeset with the article, revtex4-1, and elsarticle document \
classes. As a service to authors, the document class comes with \
a predefined bibilography style quantum.bst that is optimized \
to be used with the quantumarticle document class. \
Additionally, the quantumview documentclass is provided, which \
can be used as a proxy to typeset the HTML-only editorial \
pieces in Quantum Views in a LaTeX editor. The quantumarticle \
document class also offers an option to remove the \
Quantum-related branding. In that way, users appreciating the \
esthetics of this document class can use it for their notes as \
well."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1svn65242"

RPM_NAME = "texlive-quantumarticle-2023.209.6.1svn65242-54.1.noarch.rpm"
RPM_HASH = "b043b8fbd2b7bf579b0ff349e0fa9d3c4aa76f4846bec6195c2efe2c51c48e5c566610e97cadd3aa5f10c218aaf8171d2ae4321934c5453c846f7594d6fd845c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quantumarticle.cls \
tex-quantumview.cls \
texlive-quantumarticle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bbm.sty \
tex-caption.sty \
tex-dsfont.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lmodern.sty \
tex-ltxcmds.sty \
tex-ltxgrid.sty \
tex-natbib.sty \
tex-soul.sty \
tex-tikz.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
