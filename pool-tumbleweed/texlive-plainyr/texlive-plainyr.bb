SUMMARY = "Plain bibliography style, sorted by year first"
DESCRIPTION = "This is a version of the standard plain BibTeX style, modified \
to sort chronologically (by year) first, then by author, title, \
etc. (The style's name isn't what the author submitted: it was \
renamed for clarity.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn52783"

RPM_NAME = "texlive-plainyr-2023.201.svn52783-51.1.noarch.rpm"
RPM_HASH = "b1a3c5c0d5b857bc369f2589b99f28f0d9e841d42f15c2d17617082b35950785a1b34fd42027b5fdaef1f3dd413fa2a9cf1154a818fb5866bb89a27149fbce6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plainyr"

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
