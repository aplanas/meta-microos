SUMMARY = "Publication quality tables in LaTeX"
DESCRIPTION = "The package enhances the quality of tables in LaTeX, providing \
extra commands as well as behind-the-scenes optimisation. \
Guidelines are given as to what constitutes a good table in \
this context. From version 1.61, the package offers longtable \
compatibility."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.61803398svn53402"

RPM_NAME = "texlive-booktabs-2023.201.1.61803398svn53402-52.1.noarch.rpm"
RPM_HASH = "04e681642d2561ef56627d6729b0f67efcdf40dd5be59dea447ce2817680b6e46b79a7eef50aeb5a372252cd3b554a7adfe2e2529bc3848f91f2feb0113c4319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(booktabs.sty) \
texlive-booktabs"
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
