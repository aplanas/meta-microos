SUMMARY = "Draw admonition blocks in your documents, illustrated with FontAwesome icons"
DESCRIPTION = "Awesome Boxes is all about drawing admonition blocks around \
text to inform or alert readers about something particular. The \
specific aim of this package is to use FontAwesome icons to \
ease the illustration of these blocks. The package depends on \
fontawesome5, xcolor, array and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn57349"

RPM_NAME = "texlive-awesomebox-2023.209.0.0.6svn57349-54.1.noarch.rpm"
RPM_HASH = "6064b9ae107e0490c01e5460ae37f6db84c7975baecae378c0a397d43b81cca0e8ca2768ce25b10dcb0fe1f9304a701750ce65c9e2db882ada367179ba41218a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-awesomebox.sty \
texlive-awesomebox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-fontawesome5.sty \
tex-ifthen.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
