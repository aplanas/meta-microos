SUMMARY = "Template for a simple resume or curriculum vitae (CV), in XeLaTeX"
DESCRIPTION = "Template for a simple resume or curriculum vitae (CV), in \
XeLaTeX. Simple template that can be further customized or \
extended, with numerous examples."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn43057"

RPM_NAME = "texlive-simple-resume-cv-2023.201.svn43057-53.1.noarch.rpm"
RPM_HASH = "125af821aeef5aab77116e59b82c36125904d215298a55effa89e65d4f5134e944a6884d255a79d49e143135f9c05cbf643d198460e201ae674887bcda2a5ba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(simpleresumecv.cls) \
texlive-simple-resume-cv"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(color.sty) \
tex(datetime2.sty) \
tex(fontspec.sty) \
tex(hyperref.sty) \
tex(hyphenat.sty) \
tex(xltxtra.sty) \
tex(xunicode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
