SUMMARY = "Babel/Polyglossia support for Galician"
DESCRIPTION = "The package provides a language description file that enables \
support of Galician either with babel or with polyglossia."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.3csvn30270"

RPM_NAME = "texlive-babel-galician-2023.209.4.3csvn30270-54.1.noarch.rpm"
RPM_HASH = "91198a2bcd0d888d96028904a56cb0881f711180dd266f7f96fb5fb062a6397f337ec55f3e70c00e22d8ce6f7ca90e5ba40ac99cdf013323949a98e355516ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-galician.ldf \
texlive-babel-galician"

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
