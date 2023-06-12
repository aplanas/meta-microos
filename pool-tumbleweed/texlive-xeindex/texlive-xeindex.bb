SUMMARY = "Automatic index generation for XeLaTeX"
DESCRIPTION = "The package is based on XeSearch, and will automatically index \
words or phrases in an XeLaTeX document. Words are declared in \
a list, and every occurrence then creates an index entry whose \
content can be fully specified beforehand."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn35756"

RPM_NAME = "texlive-xeindex-2023.201.0.0.3svn35756-52.1.noarch.rpm"
RPM_HASH = "31dd4d7da2792e5190bd49294abed4313f505211e270d7b83fbdcc8796ad30174872bfea6a3c42d9e219c6be7d2d35827a7afedd1ebeaa7b06c54b635f23390e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xeindex.sty) \
texlive-xeindex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(makeidx.sty) \
tex(xesearch.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
