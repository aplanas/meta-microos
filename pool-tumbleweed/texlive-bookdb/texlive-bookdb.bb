SUMMARY = "A BibTeX style file for cataloguing a home library"
DESCRIPTION = "This package provides an extended book entry for use in \
cataloguing a home library. The extensions include fields for \
binding, category, collator, condition, copy, illustrations, \
introduction, location, pages, size, value, volumes."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn37536"

RPM_NAME = "texlive-bookdb-2023.209.0.0.2svn37536-53.1.noarch.rpm"
RPM_HASH = "c940931d3944bcd35c27ad8c5592c59f6125f4762018d696cef52719870a8fc91cc8de2acb7a61e5dc55a057739dc689735d944bbf2e88805a03b9d9a63e36c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookdb"

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
