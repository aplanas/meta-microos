SUMMARY = "Plain bibliography style, sorted by year first"
DESCRIPTION = "This is a version of the standard plain BibTeX style, modified \
to sort chronologically (by year) first, then by author, title, \
etc. (The style's name isn't what the author submitted: it was \
renamed for clarity.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn52783"

RPM_NAME = "texlive-plainyr-2023.209.svn52783-52.1.noarch.rpm"
RPM_HASH = "953131995086b625f10e88dd00042dda82f560ba6e7cbc9a01d50a5972146594e98ec90d6e1db5355792daa69010e148270d2e2823cb2ca6c1ec1a091ffc9b6d"
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
