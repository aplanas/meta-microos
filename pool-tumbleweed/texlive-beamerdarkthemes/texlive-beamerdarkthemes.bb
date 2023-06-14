SUMMARY = "Dark color themes for beamer"
DESCRIPTION = "A package with three dark color themes for beamer, designed for \
presentations with pictures and/or for bright rooms without \
screen. These themes mix one dominant foreground colour and a \
black background. Cormorant stands for green, frigatebird for \
red and magpie for blue."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.1svn55117"

RPM_NAME = "texlive-beamerdarkthemes-2023.201.0.0.5.1svn55117-53.1.noarch.rpm"
RPM_HASH = "bcf1f43141cf27d73df6cdc7aadfa3601e1e85b02048490c663f475752786fd9e00ad6e12665f7e31f2bbf7781d6427cdd10dad2ad5efa0ab11bb5ee3813b65c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemecormorant.sty \
tex-beamercolorthemefrigatebird.sty \
tex-beamercolorthememagpie.sty \
texlive-beamerdarkthemes"

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
