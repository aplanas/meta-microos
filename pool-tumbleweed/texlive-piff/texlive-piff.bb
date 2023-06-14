SUMMARY = "Macro tools by Mike Piff"
DESCRIPTION = "The set (now) consists of: a small package for dealing with \
duplicate-numbered output pages; newproof, for defining \
mathematical proof structures; onepagem for omitting the page \
number in one-page documents and time, which prints a 12-hour \
format time."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn21894"

RPM_NAME = "texlive-piff-2023.201.svn21894-51.1.noarch.rpm"
RPM_HASH = "7824c93a56045e35a2b1ee73fbfa49a78a15e94b5c33c59e76292e3ff2754078ae7d477e3510774dfefa3ecf5a76885434d1ecbd3c9c756d0df71d5a375beb02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-duplicat.sty \
tex-newproof.sty \
tex-onepagem.sty \
tex-time.sty \
texlive-piff"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
