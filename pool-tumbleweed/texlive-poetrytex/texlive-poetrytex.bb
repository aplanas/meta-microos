SUMMARY = "Typeset anthologies of poetry"
DESCRIPTION = "The package is designed to aid in the management and formatting \
of anthologies of poetry and other writings; it does not \
concern itself with actually typesettinig the verse itself."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.1svn39921"

RPM_NAME = "texlive-poetrytex-2023.201.3.0.1svn39921-52.1.noarch.rpm"
RPM_HASH = "33ce170c29b7ca89612c2f46d1430b937794693b2d6be9933d73f16151c93156d122bc92519de712e8ee12bc501e47f922e04de55000f98daf9a08bd5dfa8813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(poetrytex.sty) \
texlive-poetrytex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(tocloft.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
