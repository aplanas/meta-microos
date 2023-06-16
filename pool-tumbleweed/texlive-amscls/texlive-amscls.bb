SUMMARY = "AMS document classes for LaTeX"
DESCRIPTION = "This bundle contains three AMS classes, amsart (for writing \
articles for the AMS), amsbook (for books) and amsproc (for \
proceedings), together with some supporting material. This \
material forms one branch of what was originally the AMS-LaTeX \
distribution. The other branch, amsmath, is now maintained and \
distributed separately. The user documentation can be found in \
the package amscls-doc."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.20.6svn55378"

RPM_NAME = "texlive-amscls-2023.201.2.20.6svn55378-54.1.noarch.rpm"
RPM_HASH = "d87ea297fad01b92e1518bbe8062ed84e84a8a6f9cca99c1d4d429e17a9078b2abccaeba108a6482d2243bc14a9de2bed33202fde527e7d6cdb35dafe269aa57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amsart.cls \
tex-amsbook.cls \
tex-amsbooka.sty \
tex-amsdtx.cls \
tex-amsldoc.cls \
tex-amsmidx.sty \
tex-amsproc.cls \
tex-amsthm.sty \
tex-upref.sty \
texlive-amscls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-book.cls \
tex-doc.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
