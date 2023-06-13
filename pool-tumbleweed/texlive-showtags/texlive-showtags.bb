SUMMARY = "Print the tags of bibliography entries"
DESCRIPTION = "Prints the tag right-aligned on each line of the bibliography."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.05svn20336"

RPM_NAME = "texlive-showtags-2023.201.1.05svn20336-53.1.noarch.rpm"
RPM_HASH = "c62bd28cad46d8e7ce4b8457159b8ad8aeb78292bc7f1ef9fb6c110e5fcf5fb7654cd2ff33bfd7034b049f472351f08395ddbbe354ab27e3f86bc17fc62f898c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(showtags.sty) \
texlive-showtags"

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
