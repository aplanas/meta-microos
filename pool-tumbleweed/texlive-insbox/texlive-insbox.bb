SUMMARY = "Insert pictures/boxes into paragraphs"
DESCRIPTION = "The package provides convenient bundling of the \\parshape \
primitive. LaTeX users should note that this is a generic \
package, and should be loaded using \\input ."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.2svn34299"

RPM_NAME = "texlive-insbox-2023.201.2.2svn34299-52.1.noarch.rpm"
RPM_HASH = "9ca42bfad3e3f6550a9320fa87c7ae7bd912585767a8f2ff3e7a04a47afea532891c7158f359894e1e7693589f48ac999bd9f003c94e87041baa9c4c28639f08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(insbox.tex) \
texlive-insbox"
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
