SUMMARY = "Automatic cover page creation for scientific papers"
DESCRIPTION = "The package CoverPage was created to supplement scientific \
papers with a cover page containing bibliographical \
information, a copyright notice, and/or some logos of the \
author's institution. The cover page is created (almost) \
automatically; this is done by parsing BibTeX information \
corresponding to the main document and reading a configuration \
file in which the author can set information like the \
affiliation he or she is associated with. The cover page \
consists of header, body and footer; all three are macros which \
can be redefined using \\renewcommand, thus allowing easy \
customization of the package. Additionally, it should be \
stressed that the cover page layout is totally independent of \
the main document and its page layout. This package requires \
four other packages (keyval, url, textcomp, and verbatim), but \
all of them are standard packages and should be part of every \
LaTeX installation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn63509"

RPM_NAME = "texlive-coverpage-2023.209.1.01svn63509-55.1.noarch.rpm"
RPM_HASH = "94799b6aabac9c4f6c066282a2520e617a9888e118d781b12bd911991f7068d2f4e8d2f717934f2a8e00c66b5ea7e9082d49368886e734d4d032c05ffbe3df99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CoverPage.cfg \
tex-CoverPage.sty \
texlive-coverpage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-textcomp.sty \
tex-url.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
