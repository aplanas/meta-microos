SUMMARY = "The QualiType font collection"
DESCRIPTION = "These 45 fonts were created by QualiType. With the kind \
permisison of John Colletti, these fonts have been released as \
free and open-source."
LICENSE = "OFL-1.1"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-qualitype-2023.201.svn54512-53.2.noarch.rpm"
RPM_HASH = "aa3080e7785232348cdc292c1a802b93ed56a985d152eca4790a487a5267d876bc629c3759112cc10d91156840d413c5caefc1ee07de642924f18659d0791c82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qualitype"

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
texlive-qualitype-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
