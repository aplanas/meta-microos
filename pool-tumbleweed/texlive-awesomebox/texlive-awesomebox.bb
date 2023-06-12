SUMMARY = "Draw admonition blocks in your documents, illustrated with FontAwesome icons"
DESCRIPTION = "Awesome Boxes is all about drawing admonition blocks around \
text to inform or alert readers about something particular. The \
specific aim of this package is to use FontAwesome icons to \
ease the illustration of these blocks. The package depends on \
fontawesome5, xcolor, array and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn57349"

RPM_NAME = "texlive-awesomebox-2023.201.0.0.6svn57349-53.1.noarch.rpm"
RPM_HASH = "472d90f2f0f13051babe346bb46394858ca0ca6c7c220579709a351f60698e16c15c0081b44dbb3cb6e91b178d0510d9d91a88ecd7a0852fc4e5ab2b27558b90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(awesomebox.sty) \
texlive-awesomebox"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(fontawesome5.sty) \
tex(ifthen.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
