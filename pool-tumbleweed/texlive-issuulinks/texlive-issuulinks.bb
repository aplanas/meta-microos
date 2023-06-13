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

PV = "2023.201.1.1svn25742"

RPM_NAME = "texlive-issuulinks-2023.201.1.1svn25742-55.1.noarch.rpm"
RPM_HASH = "40770fe4f8183816d7d47feea05f3807e7f622e10c6f1da845b69c465d419189344d347965d48b6fce7681b0050282f7b2afcc43174e07228e6af29a7eadb4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(issuulinks.sty) \
texlive-issuulinks"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
