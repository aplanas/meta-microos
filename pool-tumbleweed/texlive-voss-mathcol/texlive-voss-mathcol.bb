SUMMARY = "Typesetting mathematics in colour, in (La)TeX"
DESCRIPTION = "This is a short paper from the TeXnische Komodie, in German. \
Since the body of the paper is dominated by clear LaTeX coding \
examples, most LaTeX programmers will understand how to achieve \
the results shown in the diagrams, even if they don't \
understand German."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn32954"

RPM_NAME = "texlive-voss-mathcol-2023.201.0.0.1svn32954-53.1.noarch.rpm"
RPM_HASH = "5f1564276ab20c0071463a339444db226cfdf22e1061728c174aa7dfc3e4e1cc60612a1453f16d137beef54f3a0c346d08a684a55946581b5c543440392a2422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-voss-mathcol"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
