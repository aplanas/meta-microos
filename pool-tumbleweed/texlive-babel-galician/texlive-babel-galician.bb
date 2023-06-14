SUMMARY = "Babel/Polyglossia support for Galician"
DESCRIPTION = "The package provides a language description file that enables \
support of Galician either with babel or with polyglossia."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.3csvn30270"

RPM_NAME = "texlive-babel-galician-2023.201.4.3csvn30270-53.1.noarch.rpm"
RPM_HASH = "e857f6e84f54cb8a79cfd5c31a359e6dec719045802c466fe3270821ae9dbe23474ee9191fbd1143ce19fbd47433ed76e16a9f86310ff408ad4e1f8ea8482a08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-galician.ldf \
texlive-babel-galician"

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
