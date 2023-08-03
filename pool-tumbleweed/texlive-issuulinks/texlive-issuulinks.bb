SUMMARY = "Produce external links instead of internal ones"
DESCRIPTION = "The PDF visualizer http://issuu.com/ISSUU is a popular service \
which shows PDF documents 'a page a time'. Due to the way it is \
implemented, internal links in these documents are not allowed. \
Instead, they must be converted to external ones in the form \
http://issuu.com/action/page?page=PAGENUMBER. The package \
patches hyperref to produce external links in the required form \
instead of internal links created by \\ref, \\cite and other \
commands. Since the package redefines the internals of \
hyperref, it must be loaded it AFTER hyperref."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn25742"

RPM_NAME = "texlive-issuulinks-2023.209.1.1svn25742-56.1.noarch.rpm"
RPM_HASH = "8e0abaa531e1e71ae004c3da07b19ee326be674030895fac8eaa11ea2d3b73308cca2ea82900dc92e90396a7a72a6aba5d2ed746358c42834470307f189aee5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-issuulinks.sty \
texlive-issuulinks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
