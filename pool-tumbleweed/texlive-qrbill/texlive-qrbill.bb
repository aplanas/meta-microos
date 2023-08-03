SUMMARY = "Create QR bills using LaTeX"
DESCRIPTION = "This LaTeX package provides support for creating QR-bills for \
the new Swiss payment standards. This open source \
implementation is intended to offer a free option to support \
these regulations and can be adapted for international use. \
Packages loaded by qrbill are expl3, fontspec (except if one is \
using a custom font setup), graphicx, scrbase, qrcode, iftex, \
l3keys2e, and numprint."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn66301"

RPM_NAME = "texlive-qrbill-2023.209.2.00svn66301-54.1.noarch.rpm"
RPM_HASH = "22bcde9e87db894a752234e647c80baa6e1d1b98a92b0c5d4b8947fe2aae3880d6ea754bfa3a26f3750877823206d394cce21e7ca4321d2152e65e5708968856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epc.qrbill-cfg.tex \
tex-qrbill.sty \
tex-swiss.qrbill-cfg.tex \
texlive-qrbill"

RDEPENDS:${PN} += "/usr/bin/sh \
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
