SUMMARY = "An introductory tutorial for Metafont"
DESCRIPTION = "An old introduction to the use of Metafont, that has stood the \
test of time. It focuses on using the program, rather than \
designing fonts, but does offer advice about understanding \
errors in other people's fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn29803"

RPM_NAME = "texlive-metafont-beginners-2023.201.svn29803-54.1.noarch.rpm"
RPM_HASH = "a1f5e98a9afffff312afc0785a1dd13be57ec1f62984ad39a45b0e905cc6b16fe6a800b90c19577840c608403610584250cd2ae00b598bfe62d45326373ab54e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metafont-beginners"

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
