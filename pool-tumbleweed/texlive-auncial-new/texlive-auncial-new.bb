SUMMARY = "Artificial Uncial font and LaTeX support macros"
DESCRIPTION = "The auncial-new bundle provides packages and fonts for a script \
based on the Artificial Uncial manuscript book-hand used \
between the 6th & 10th century AD. The script consists of \
minuscules and digits, with some appropriate period punctuation \
marks. Both normal and bold versions are provided, and the font \
is distributed in Adobe Type 1 format. This is an experimental \
new version of the auncial bundle, which is one of a series of \
bookhand fonts. The font follows the B1 encoding developed for \
bookhands. Access to the encoding is essential. The encoding \
mainly follows the standard T1 encoding."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn62977"

RPM_NAME = "texlive-auncial-new-2023.201.2.0svn62977-53.1.noarch.rpm"
RPM_HASH = "5167d36c99343029ec6895e1721befaa73aedb07b695b17d0735c4c0e7e28cd9ab05c7a7fdb1c325818f22c792c1058a76b5ada00261f0aab8633901a8c181a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(allauncl.sty) \
tex(auncial.map) \
tex(auncial.sty) \
tex(auncl10.tfm) \
tex(aunclb10.tfm) \
tex(b1auncl.fd) \
texlive-auncial-new"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-auncial-new-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
