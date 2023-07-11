SUMMARY = "A PSTricks package for drawing Venn sets"
DESCRIPTION = "This is a PSTricks related package for drawing Venn diagrams \
with three circles."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn49316"

RPM_NAME = "texlive-pst-venn-2023.201.0.0.01svn49316-53.2.noarch.rpm"
RPM_HASH = "78cc0385a78cd7a36e0a626139b17fc40590693ce0981489a02f40c108c95a10fad2d71edc6b8cb8c7910192035e1498ca3400c9d95f94fafcdf5ca7683c292a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-venn.sty \
texlive-pst-venn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
