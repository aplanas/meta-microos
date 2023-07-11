SUMMARY = "Embed source files into the generated PDF"
DESCRIPTION = "The package provides a means of storing a project, without \
losing anything. It uses the embedfile package to attach to the \
generated PDF all files used in creating your project. In \
particular, it can embed images, external TeX files, external \
codes and"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn51177"

RPM_NAME = "texlive-embedall-2023.201.2.0svn51177-53.2.noarch.rpm"
RPM_HASH = "b11878b52a64542480c86366c6b28dd528020663cb9dd649c3410d7eedafcedd31f1edd253edcc5230165895cfd10e950532144da57746e750235ac67f68bcca"
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
