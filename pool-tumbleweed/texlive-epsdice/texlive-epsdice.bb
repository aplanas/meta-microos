SUMMARY = "A scalable dice 'font'"
DESCRIPTION = "The epsdice package defines a single command \\epsdice that \
takes a numeric argument (in the range 1-6), and selects a face \
image from a file that contains each of the 6 possible die \
faces. The graphic file is provided in both Encapsulated \
PostScript and PDF formats."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-epsdice-2023.201.2.1svn15878-53.2.noarch.rpm"
RPM_HASH = "f7381f6b7a14d1aebcc8487b62dc66944eb8376622fbae3513e27e228bca35a7ac9f532c5ac596bdd340a84c1e87f0c33fc9a96569a4a3ebde7b31b89e11155d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epsdice.cfg \
tex-epsdice.sty \
texlive-epsdice"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
