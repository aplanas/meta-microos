SUMMARY = "Generalization of LaTeX's minipages"
DESCRIPTION = "The GenMPage package generalizes LaTeX's minipages. Keyval \
options and styles can be used to determine their appearance in \
an easy and consistent way. Includes options for paragraph \
indentation and vertical alignment with respect to the visual \
top and bottom margins."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.1svn15878"

RPM_NAME = "texlive-genmpage-2023.209.0.0.3.1svn15878-53.1.noarch.rpm"
RPM_HASH = "6bc7eb99f7855ec6e77c045dfb47a5839881f25a4548c940496d36e0d7e309b4d6c5b16dd3222e5e86798595220e76dc706f82769b956e249a81d66cefb2f968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-genmpage.sty \
texlive-genmpage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
