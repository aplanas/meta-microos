SUMMARY = "Sutterlin"
DESCRIPTION = "The package supports use, in LaTeX, of the Metafont emulation \
of the Sueterlin handwriting fonts The package is distributed \
as part of the fundus bundle.."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn26030"

RPM_NAME = "texlive-fundus-sueterlin-2023.209.1.2svn26030-53.1.noarch.rpm"
RPM_HASH = "9815d322911b28b79446f4ce8d32f6055a9544be968d66489fc814a7ee01fae3ae8efba665604cf6afea1e7acd0e01f40ef031711c018f4833afaa47e65a8aa4"
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
