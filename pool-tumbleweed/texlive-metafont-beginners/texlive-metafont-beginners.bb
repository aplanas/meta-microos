SUMMARY = "An introductory tutorial for Metafont"
DESCRIPTION = "An old introduction to the use of Metafont, that has stood the \
test of time. It focuses on using the program, rather than \
designing fonts, but does offer advice about understanding \
errors in other people's fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn29803"

RPM_NAME = "texlive-metafont-beginners-2023.209.svn29803-55.1.noarch.rpm"
RPM_HASH = "88a344acfd2bcb29c893a78cf17062e92e96efdfd1f879d721ad619975d89cab4eac2a2a7dfb05635b6c94bef17d12235784c4079c7c31e643e5ccc06cd588b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metafont-beginners"

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
