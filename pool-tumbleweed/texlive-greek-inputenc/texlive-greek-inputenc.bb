SUMMARY = "Greek encoding support for inputenc"
DESCRIPTION = "The bundle provides UTF-8, Macintosh Greek encoding and ISO \
8859-7 definition files for use with inputenc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8.2svn66296"

RPM_NAME = "texlive-greek-inputenc-2023.201.1.8.2svn66296-53.2.noarch.rpm"
RPM_HASH = "8b4858a9c9e222ac7c9d0857a32b51305857c35f19dfa20b2b07c897c3295baf63978657835294cb0e8132cc8b1e0f1ff783aa66fc85ada5facf36931b950375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iso-8859-7.def \
tex-macgreek.def \
texlive-greek-inputenc"

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
