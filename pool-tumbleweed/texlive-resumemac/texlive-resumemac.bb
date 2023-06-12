SUMMARY = "Plain TeX macros for resumes"
DESCRIPTION = "A set of macros is provided, together with an file that offers \
an example of use."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-resumemac-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "6fb6ee768ac0dd5c0ab99f91b664a069159febaa7a6cf98c019918d985d9ef0220b02aad3f32193fa4e1dd0d143b1e55827c0dce70247ce355f9ec1030ef5b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(resumemac.tex) \
texlive-resumemac"
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
