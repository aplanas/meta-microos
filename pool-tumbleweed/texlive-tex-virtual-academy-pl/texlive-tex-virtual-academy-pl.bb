SUMMARY = "TeX usage web pages, in Polish"
DESCRIPTION = "TeX Virtual Academy is a bundle of Polish documentation in HTML \
format about TeX and Co. It contains information for beginners, \
LaTeX packages, descriptions, etc."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.svn34177"

RPM_NAME = "texlive-tex-virtual-academy-pl-2023.209.svn34177-55.1.noarch.rpm"
RPM_HASH = "69470a9e3f756af7bad61807bc87102c207095737b493e24c48dc95b46184e195f3b3c630f293ee55af9d5ac3ae1a4b22419fa5074f7f7d28378915ceb1cbcea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-virtual-academy-pl"

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
