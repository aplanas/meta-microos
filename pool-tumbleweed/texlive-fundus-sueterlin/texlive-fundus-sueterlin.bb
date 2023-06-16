SUMMARY = "Sutterlin"
DESCRIPTION = "The package supports use, in LaTeX, of the Metafont emulation \
of the Sueterlin handwriting fonts The package is distributed \
as part of the fundus bundle.."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn26030"

RPM_NAME = "texlive-fundus-sueterlin-2023.201.1.2svn26030-52.1.noarch.rpm"
RPM_HASH = "cac1eb2dba08d9f9182b01ee269177d1c32445c64ee2546806b2911ff740b1944b4c15c2a12ba94e44a7e40152b2fe17e2b8bcc95532afbce57ffcf50fdcbb89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-suetterl.sty \
texlive-fundus-sueterlin"

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
