SUMMARY = "Control the behaviour of '_' in text"
DESCRIPTION = "With the package, \\_ in text mode (i.e., \\textunderscore) \
prints an underscore so that hyphenation of words either side \
of it is not affected; a package option controls whether an \
actual hyphenation point appears after the underscore, or \
merely a break point. The package also arranges that, while in \
text, '_' itself behaves as \\textunderscore (the behaviour of _ \
in maths mode is not affected)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18261"

RPM_NAME = "texlive-underscore-2023.209.svn18261-54.1.noarch.rpm"
RPM_HASH = "edd5af8d746f884dcd578d77acfa4480997eef28ed018c36ec8a204d454e24868754a48c9fd0606504cfc7ddaf7938d03cd1bc6811505fe65669a1a5f87f0f62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-underscore.sty \
texlive-underscore"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chicago.sty \
tex-fontenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
