SUMMARY = "Support for Washington University Cyrillic fonts"
DESCRIPTION = "The package supports the use of the Washington Cyrillic fonts \
with LaTeX (Note that standard LaTeX has support, too, as \
encoding OT2). The package is distributed as part of the fundus \
bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn26019"

RPM_NAME = "texlive-fundus-cyr-2023.201.svn26019-52.1.noarch.rpm"
RPM_HASH = "05edf44173a53d39cf943f4e8cd45a49f9915d420e922534ac8c7b6853bd970e5853bf43f0620a32993013c38fc1c706613e81f452f17beb9152b08a63c7513a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cyr.sty \
texlive-fundus-cyr"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cyracc.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
