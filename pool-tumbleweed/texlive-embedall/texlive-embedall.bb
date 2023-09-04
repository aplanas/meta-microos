SUMMARY = "Embed source files into the generated PDF"
DESCRIPTION = "The package provides a means of storing a project, without \
losing anything. It uses the embedfile package to attach to the \
generated PDF all files used in creating your project. In \
particular, it can embed images, external TeX files, external \
codes and"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn51177"

RPM_NAME = "texlive-embedall-2023.209.2.0svn51177-54.2.noarch.rpm"
RPM_HASH = "5ad37281ab94ca001cfa3b41bfb898386e48f206c7eda411b820c194984192513aba77776d1663c1bb5de7510f743ae49fddb35cd09998a976eb5b3ed173d69c"
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
