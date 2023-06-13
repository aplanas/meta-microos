SUMMARY = "Bibliography style that approaches APA requirements"
DESCRIPTION = "Described as a 'local adaptation' of apalike (which is part of \
the base BibTeX distribution)."
LICENSE = "SUSE-TeX"

PV = "2023.201.svn54080"

RPM_NAME = "texlive-apalike2-2023.201.svn54080-54.1.noarch.rpm"
RPM_HASH = "3783f5df8a445a55aebb5ea29ac45fa63b69d7067228b7b5907c2a16e8fcfad5584d5843ae6138c50abb90d42352d97eee6e2c2f8000118c21866e4138dda8e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike2"

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
