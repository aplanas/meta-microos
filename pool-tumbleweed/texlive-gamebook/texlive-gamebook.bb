SUMMARY = "Typeset gamebooks and other interactive novels"
DESCRIPTION = "This package provides the means in order to lay-out gamebooks \
with LaTeX. A simple gamebook example is included with the \
package, and acts as a tutorial."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24714"

RPM_NAME = "texlive-gamebook-2023.209.1.0svn24714-53.1.noarch.rpm"
RPM_HASH = "943940831e708cf7bcaf65659d5df468bc0c20d65276345000cabbcf322c96cd99ab5495fa957d4c2a7a366ee19c5e7f36cd412b587d249dcff8dbb0aae8c313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gamebook.sty \
texlive-gamebook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-draftwatermark.sty \
tex-enumitem.sty \
tex-extramarks.sty \
tex-fancyhdr.sty \
tex-ifthen.sty \
tex-prelim2e.sty \
tex-scrtime.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
