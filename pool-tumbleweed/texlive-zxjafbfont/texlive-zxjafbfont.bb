SUMMARY = "Fallback CJK font support for xeCJK"
DESCRIPTION = "The zxjafbfont package"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn28539"

RPM_NAME = "texlive-zxjafbfont-2023.201.0.0.2svn28539-52.1.noarch.rpm"
RPM_HASH = "84e86086977c7b2267d354727815571e0f72ca6195bc4a94b03c6ef6bd53798427a148ccf05eb73b86fcb12b26ad6ff17c72d7455c425e92a78f9ce747d284a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(zxjafbfont.sty) \
texlive-zxjafbfont"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xeCJK.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
