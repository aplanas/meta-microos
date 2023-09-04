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

RPM_NAME = "texlive-qrbill-2023.209.2.00svn66301-54.2.noarch.rpm"
RPM_HASH = "c4367e3586a641d805e962c47b58959a797d61b0a09e17a1f8cb07c0b588656d0af87f40675c155a6a76423583ff327cd259f570d5beb7040f5b4945e1493928"
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
