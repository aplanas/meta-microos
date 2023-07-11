SUMMARY = "Include Git information in the document as watermark or via variables"
DESCRIPTION = "If your LaTeX-document is version-controlled with git, you \
might encounter situations, where you want to include some \
information of your git-repository into your LaTeX-document- \
e.g. to keep track on who gave you feedback on which version of \
your document. This git-information can be included on every \
page by a watermark or (for custom needs) via provided \
variables."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64662"

RPM_NAME = "texlive-gitstatus-2023.201.1.1svn64662-53.2.noarch.rpm"
RPM_HASH = "8a7009d9404d41b8583b890c34543d7cd22234f0b73da4470ecc3120490404ec5bf47e042bfdaad28b36d6686daad432bde035f7050553e434d8b60290d0a4e7"
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
