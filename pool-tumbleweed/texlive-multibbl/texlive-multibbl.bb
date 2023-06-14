SUMMARY = "Multiple bibliographies"
DESCRIPTION = "The package multibbl redefines the standard bibliographic \
commands so that one can generate multiple reference sections. \
Each section has it own auxiliary file (for use with BibTeX) \
and title."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-multibbl-2023.201.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "054db71c04ecb88c4be5398674ce98586fedf699f18fe41ad3f106d014457c187e43891962e48580c0d859c4e81dea8ff6b1a3e3a8b91704f93b3f9f2fcada2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multibbl.sty \
texlive-multibbl"

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
