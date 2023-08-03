SUMMARY = "LaTeX document shell for ANU final exam"
DESCRIPTION = "This LaTeX document shell is created for the standard \
formatting of final exams in The Australian National \
University."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn26053"

RPM_NAME = "texlive-anufinalexam-2023.209.svn26053-55.1.noarch.rpm"
RPM_HASH = "1d88a3b6f9099201edcf225cd109f8fb535afc4b38be0ff3de5a9686cfb97fcfe261726d00ce9dc46495815c64838f07e982e1d4e82747c3b299a09577a9fb63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-anufinalexam"

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
