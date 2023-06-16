SUMMARY = "Babel support for Portuges"
DESCRIPTION = "The package provides the language definition file for support \
of Portuguese and Brazilian Portuguese in babel. Some shortcuts \
are defined, as well as translations to Portuguese of standard \
'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2tsvn59883"

RPM_NAME = "texlive-babel-portuges-2023.201.1.2tsvn59883-53.1.noarch.rpm"
RPM_HASH = "f13f1f82eefd97c8b8c13e87db4e687fdfb1de6563bed881799ab28a9a6737a360c5712457c39870f98f39f9f3710556492687eee7070a5afcbff1b27cb8fd22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brazil.ldf \
tex-brazilian.ldf \
tex-portuges.ldf \
tex-portuguese.ldf \
texlive-babel-portuges"

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
