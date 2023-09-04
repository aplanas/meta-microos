SUMMARY = "Mathematics in Greek texts"
DESCRIPTION = "This package has been designed to facilitate the use of Greek \
letters in mathematical mode. The package allows one to \
directly type in Greek letters (in ISO 8859-7 encoding) in math \
mode."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-elmath-2023.209.1.2svn15878-54.2.noarch.rpm"
RPM_HASH = "4291fafdc0ff25c20c1db870c954ec41b5b4172a0a18fa2e1e5aa14ee06cbe6d34194d234abf8833d5704f67e9e3e733f12c447776904b203f63bf918ed6c983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elmath.sty \
texlive-elmath"

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
