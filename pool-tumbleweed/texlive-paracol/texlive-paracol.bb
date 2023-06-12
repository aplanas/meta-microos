SUMMARY = "Multiple columns with texts 'in parallel'"
DESCRIPTION = "The package provides yet another multi-column typesetting \
mechanism by which you produce multi-column (e.g., bilingual) \
document switching and sychronizing each corresponding part in \
'parallel'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.35svn49560"

RPM_NAME = "texlive-paracol-2023.201.1.35svn49560-51.1.noarch.rpm"
RPM_HASH = "85536978571fab79a626bb1241e4e13cca7a8ad511dedb4fc34a57584d3e20df39f3d6ced220da3d6726fe7c267bb8fe6fbb5038bb3f2d65d8fd56cf0456cb5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(paracol.sty) \
texlive-paracol"
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
