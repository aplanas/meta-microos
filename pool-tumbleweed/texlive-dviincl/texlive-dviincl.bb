SUMMARY = "Include a DVI page into MetaPost output"
DESCRIPTION = "DVItoMP is one of the auxiliary programs available to any \
MetaPost package; it converts a DVI file into a MetaPost file. \
Using it, one can envisage including a DVI page into an EPS \
files generated by MetaPost. Such files allow pages to include \
other pages."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.00svn29349"

RPM_NAME = "texlive-dviincl-2023.201.1.00svn29349-53.1.noarch.rpm"
RPM_HASH = "62b034be8b916b88602cf43bc01319325659cdde2572a9e652e6609cdcafdab2186324afb9b2cee4a06871b912b469c40ea540b47ffe9bcedc754fee508057f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviincl"

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
