SUMMARY = "Supplementary outer and inner themes for beamer"
DESCRIPTION = "This bundle provides a collection of inner and outer themes as \
supplements to the default themes in the beamer distribution. \
These themes can be used in combination with existing inner, \
outer, and color themes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02asvn56087"

RPM_NAME = "texlive-beamerauxtheme-2023.209.1.02asvn56087-54.1.noarch.rpm"
RPM_HASH = "8eecf36c43905c12d30c3ed081a54a39fa6c0d2899feda3bc97448bdba0bb8b4059e46ac355b469e076fdd78e0fa0edeb8fe9a72e651e845e591cf4b9cecbb16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerinnerthemesimplelines.sty \
tex-beamerouterthemesidebarwithminiframes.sty \
tex-beamerouterthemesplitwithminiframes.sty \
tex-beamerouterthemetwolines.sty \
texlive-beamerauxtheme"

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
