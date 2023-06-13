SUMMARY = "Control the typesetting of the abstract environment"
DESCRIPTION = "The abstract package gives you control over the typesetting of \
the abstract environment, and in particular provides for a one \
column abstract in a two column paper."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2asvn15878"

RPM_NAME = "texlive-abstract-2023.201.1.2asvn15878-54.1.noarch.rpm"
RPM_HASH = "f7dccb2a03f36748521e4b253adbac9467a47b4f05690494ea31b503504a8e335d709f536fde1831e6581f89b899fec8a750dde8e381b01bf3973aca60aaf509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(abstract.sty) \
texlive-abstract"

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
