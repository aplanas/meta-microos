SUMMARY = "Embed source files into the generated PDF"
DESCRIPTION = "The package provides a means of storing a project, without \
losing anything. It uses the embedfile package to attach to the \
generated PDF all files used in creating your project. In \
particular, it can embed images, external TeX files, external \
codes and"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn51177"

RPM_NAME = "texlive-embedall-2023.209.2.0svn51177-54.1.noarch.rpm"
RPM_HASH = "e374674628c67562298aeec663bba4dc393566c812d36a3499d4e3db3347a2f991bd6dc13f03ccb0692c124b6019f67a3a018d0b30aa36e9eb831009baa19631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-embedall.sty \
texlive-embedall"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-embedfile.sty \
tex-etoolbox.sty \
tex-filehook.sty \
tex-letltxmacro.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
