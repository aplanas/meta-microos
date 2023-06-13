SUMMARY = "A LaTeX tutorial"
DESCRIPTION = "The tutorial is presented as a set of slides (in Portuguese)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn24139"

RPM_NAME = "texlive-cursolatex-2023.204.svn24139-54.1.noarch.rpm"
RPM_HASH = "c9cb70264087fddf92808820c0c78e4e2b15316bf5cfb64fa68a388f5ebb1b61e7e1a382fea250f3c3451863fec4c684e44d426d8137d58e3ce2979e3ac6ee1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cursolatex"

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
