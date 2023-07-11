SUMMARY = "Plain TeX macros for resumes"
DESCRIPTION = "A set of macros is provided, together with an file that offers \
an example of use."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-resumemac-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "620836231c6bfa6348e6e01710c2d4bb35a97bc650784e0cb44ba2d9e40061bdbf57c22bffbfe1a61b593f6363db0f4e7cd50dd547d1c4a7a359f202581801fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resumemac.tex \
texlive-resumemac"

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
