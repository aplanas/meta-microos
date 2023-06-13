SUMMARY = "Introductory LaTeX course in French"
DESCRIPTION = "This package contains the supporting documentation, slides, \
exercise files, and templates for an introductory LaTeX course \
(in French) prepared for Universite Laval, Quebec, Canada."
LICENSE = "LPPL-1.0"

PV = "2023.201.2020.10svn56714"

RPM_NAME = "texlive-formation-latex-ul-2023.201.2020.10svn56714-52.1.noarch.rpm"
RPM_HASH = "4ff25d00d1f5a3a15c7cc19d62cb101c2cf036f3fb45a9ce5e495cfb748841205571b8c24bf265bc1421c45830ee93cfb9454234a094462cf9ee0d4d95c2b13a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formation-latex-ul"

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
