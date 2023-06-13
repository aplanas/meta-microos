SUMMARY = "A BibTeX style file for cataloguing a home library"
DESCRIPTION = "This package provides an extended book entry for use in \
cataloguing a home library. The extensions include fields for \
binding, category, collator, condition, copy, illustrations, \
introduction, location, pages, size, value, volumes."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn37536"

RPM_NAME = "texlive-bookdb-2023.201.0.0.2svn37536-52.1.noarch.rpm"
RPM_HASH = "b01ac4194c2d122be7021fc104e94be61ae13e3cfd82054b9d417dba7555d7afee25e30394063f4962c9d0a8eb5f73192a97ad61708646988d8968bc73da273e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bookdb"

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
