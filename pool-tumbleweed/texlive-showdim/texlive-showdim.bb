SUMMARY = "Variants on printing dimensions"
DESCRIPTION = "A package for LaTeX providing a number of commands for printing \
the value of a TeX dimension. For example, \
\\tenthpt{\\baselineskip} yields the current value of \
\\baselineskip rounded to the nearest tenth of a point."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn28918"

RPM_NAME = "texlive-showdim-2023.209.1.2svn28918-54.1.noarch.rpm"
RPM_HASH = "ff54cfd61298268c8276c4e8297ea603a97b750b5707609d79e1a287b2374479de24015bc6b823697bcbe976ec4675816d0c85ed4f66fdcde84ff2439a2246f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-showdim.sty \
texlive-showdim"

RDEPENDS:${PN} += "/usr/bin/sh \
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
