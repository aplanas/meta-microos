SUMMARY = "Multiple versions of a bibliography, with different sort orders"
DESCRIPTION = "Conventional standards for bibliography styles impose a forced \
choice between index and name/year citations, and corresponding \
references. The package avoids this choice, by providing \
alphabetic, sequenced, and even chronological orderings of \
references. Inline citations, that integrate these \
heterogeneous styles, are also supported (and work with other \
bibliography packages)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn30939"

RPM_NAME = "texlive-multibibliography-2023.209.1.03svn30939-55.1.noarch.rpm"
RPM_HASH = "45620588f689a7bd1154a9baeb3a2a9f241d7c7f24db5c48ba2b9df49bdb72602a7231337cdfbe2012bc514a888d1fc10aaa80d23ddaafc05eabc873287b8f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multibibliography.sty \
texlive-multibibliography"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-multibibliography-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
