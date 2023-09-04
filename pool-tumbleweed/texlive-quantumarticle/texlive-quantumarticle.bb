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

RPM_NAME = "texlive-quantumarticle-2023.209.6.1svn65242-54.2.noarch.rpm"
RPM_HASH = "b7652b073451fd273386c4061b7919657d0a69463f51d21993cf39d83882614c6d9044f8ea84676155926e1d9b5b800b54b19b8fa22c4b5e6c8242260c85511e"
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
