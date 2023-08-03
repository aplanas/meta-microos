SUMMARY = "Introductory LaTeX course in French"
DESCRIPTION = "This package contains the supporting documentation, slides, \
exercise files, and templates for an introductory LaTeX course \
(in French) prepared for Universite Laval, Quebec, Canada."
LICENSE = "LPPL-1.0"

PV = "2023.209.2020.10svn56714"

RPM_NAME = "texlive-formation-latex-ul-2023.209.2020.10svn56714-53.1.noarch.rpm"
RPM_HASH = "167fca72d505c5af1e9eeff4deb92c952c1c3bbdea77ba79ba792b8920ce920f7385780c887b08577d1cf00a9ac4b4d96924843f38af94827cea5ae98ee661a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formation-latex-ul"

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
