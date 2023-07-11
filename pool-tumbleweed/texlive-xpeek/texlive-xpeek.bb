SUMMARY = "Define commands that peek ahead in the input stream"
DESCRIPTION = "The package provides tools to help define commands that, like \
\\xspace and the LaTeX command \\textit, peek at what follows \
them in the command stream and choose appropriate behaviour."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn61719"

RPM_NAME = "texlive-xpeek-2023.201.0.0.2svn61719-52.2.noarch.rpm"
RPM_HASH = "b6c131e78811887236b6e8e51f41de092bfaebb90089e0d6d1ae04db3549bec8857239570f87f62c73b54e9a3cfbf3f8e020d502bdb66fd971442d44493e962e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xpeek.sty \
texlive-xpeek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
