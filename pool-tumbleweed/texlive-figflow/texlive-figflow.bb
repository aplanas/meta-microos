SUMMARY = "Flow text around a figure"
DESCRIPTION = "Provides a Plain TeX macro \\figflow that allows one to insert a \
figure into an area inset into a paragraph. Command arguments \
are width and height of the figure, and the figure (and its \
caption) itself. Usage details are to be found in the TeX file \
itself. The package does not work with LaTeX; packages such as \
wrapfig, floatflt and picins support the needs of LaTeX users \
in this area."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21462"

RPM_NAME = "texlive-figflow-2023.209.svn21462-53.1.noarch.rpm"
RPM_HASH = "120d5da90ffa5688229099f04a744d955e49754e5affd4dd5d5a8bfbe583df70e0989c8703e7c93dc25ec388cc1c48b839410f58d763207005188492c0e3ca60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figflow.tex \
texlive-figflow"

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
