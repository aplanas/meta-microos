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

RPM_NAME = "texlive-gitstatus-2023.209.1.1svn64662-54.2.noarch.rpm"
RPM_HASH = "3a8c47b68a67006e400c9978c3e12be0f0aed49733a249816b82141f1f1849078327fe277cd58eb20ae0dbb1c2f4faddfbc14ce8723fd571c03adbcedc4cfea9"
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
