SUMMARY = "Create QR bills using LaTeX"
DESCRIPTION = "This LaTeX package provides support for creating QR-bills for \
the new Swiss payment standards. This open source \
implementation is intended to offer a free option to support \
these regulations and can be adapted for international use. \
Packages loaded by qrbill are expl3, fontspec (except if one is \
using a custom font setup), graphicx, scrbase, qrcode, iftex, \
l3keys2e, and numprint."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn66301"

RPM_NAME = "texlive-qrbill-2023.201.2.00svn66301-53.1.noarch.rpm"
RPM_HASH = "c1594d6ff2d1bc785927255162782bde60a80550153fce281c5d360ade6aea9234fa95ef5679d13d7089eb3b648c047821a1395c28dc89bc46dc9834ef24d3c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epc.qrbill-cfg.tex \
tex-qrbill.sty \
tex-swiss.qrbill-cfg.tex \
texlive-qrbill"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-expl3.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-iftex.sty \
tex-l3keys2e.sty \
tex-marvosym.sty \
tex-numprint.sty \
tex-qrcode.sty \
tex-scrbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
