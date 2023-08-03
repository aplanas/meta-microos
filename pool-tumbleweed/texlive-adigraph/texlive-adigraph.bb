SUMMARY = "Augmenting directed graphs"
DESCRIPTION = "This LaTeX package provides the means to easily draw augmenting \
oriented graphs, as well as cuts on them, to demonstrate steps \
of algorithms for solving max-flow min-cut problems. This \
package requires the other LaTeX packages fp, xparse, xstring, \
and TikZ (in particular the TikZ calc library)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7.1svn49862"

RPM_NAME = "texlive-adigraph-2023.209.1.7.1svn49862-55.1.noarch.rpm"
RPM_HASH = "951d818b83a98b2fe553d58975542fab60d03341daa47b05cca75095a6bd29ae94d57b7032afa77f51fe5c9517edbf35323dba31daabc71d1c5a7e3d68596c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-adigraph.sty \
texlive-adigraph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-fp.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
