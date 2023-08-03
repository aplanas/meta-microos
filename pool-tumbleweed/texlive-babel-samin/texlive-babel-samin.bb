SUMMARY = "Babel support for Samin"
DESCRIPTION = "The package provides the language definition file for support \
of North Sami in babel. (Several Sami dialects/languages are \
spoken in Finland, Norway, Sweden and on the Kola Peninsula of \
Russia). Not all use the same alphabet, and no attempt is made \
to support any other than North Sami here. Some shortcuts are \
defined, as well as translations to Norsk of standard 'LaTeX \
names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn30288"

RPM_NAME = "texlive-babel-samin-2023.209.1.0csvn30288-54.1.noarch.rpm"
RPM_HASH = "266944ce12fdd620da1c985bcf54ffaa07f2c1203eaf91c30254f48071dbac935e8a689e4a26712d5fc9631da4c98489a5ce59f96dd5c05c794f7184712bf4df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-samin.ldf \
texlive-babel-samin"

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
