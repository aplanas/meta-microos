SUMMARY = "Typeset a dissertation cover page following UNSW guidelines"
DESCRIPTION = "The package an UNSW cover sheet following the 2011 GRS \
guidelines. It may also (optionally) provide other required \
sheets such as Originality, Copyright and Authenticity \
statements."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn66115"

RPM_NAME = "texlive-unswcover-2023.209.1.0svn66115-54.1.noarch.rpm"
RPM_HASH = "3f6264797f71f60a48b66fb4452df7ba0d43214505a59abfb8885048ed841433b0f4995f1ea9889ab61b74e14c67b1d78751081b909d5974b0fa604159debef9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unswcover.sty \
texlive-unswcover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-graphicx.sty \
tex-pdfpages.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
