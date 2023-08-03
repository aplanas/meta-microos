SUMMARY = "Citations of judgements and official documents in (German) juridical documents"
DESCRIPTION = "This package should be helpful for people working on (German) \
law. It (ab)uses BibTeX for citations of judgements and \
official documents. For this purpose, a special BibTeX-style is \
provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.52svn15878"

RPM_NAME = "texlive-jurarsp-2023.209.0.0.52svn15878-56.1.noarch.rpm"
RPM_HASH = "26ed3d2b29ed3649cd92a3b4f8e8be9198a4df425fd0f1d8c9e0f271ab0d8eded9d2645dcc301bb42e29e5b0d263fa34b13a1621d9e184888ddf6bc74ecdf48b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jurarsp.cfg \
tex-jurarsp.sty \
texlive-jurarsp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
