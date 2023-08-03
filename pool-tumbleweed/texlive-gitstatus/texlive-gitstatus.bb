SUMMARY = "Include Git information in the document as watermark or via variables"
DESCRIPTION = "If your LaTeX-document is version-controlled with git, you \
might encounter situations, where you want to include some \
information of your git-repository into your LaTeX-document- \
e.g. to keep track on who gave you feedback on which version of \
your document. This git-information can be included on every \
page by a watermark or (for custom needs) via provided \
variables."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64662"

RPM_NAME = "texlive-gitstatus-2023.209.1.1svn64662-54.1.noarch.rpm"
RPM_HASH = "35b8fdc45d4c30d950db5fee0ec7b79813394e5f64711df61ec1fed0aa485abd00a95f3d7b5d59f0c6bb16775f0460bb20ed11282803c59485e7e75e1f322043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitstatus.sty \
texlive-gitstatus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-kvoptions.sty \
tex-xcolor.sty \
tex-xstring.sty \
tex-xwatermark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
