SUMMARY = "UNAM Thesis LaTeX Template"
DESCRIPTION = "The bundle provides a template for UNAM's College of \
Engineering Theses. The work is based on Harish Bhanderi's \
PhD/MPhil template, and the University of Cambridge Engineering \
Department template."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0svn33625"

RPM_NAME = "texlive-unamth-template-2023.201.2.0svn33625-53.1.noarch.rpm"
RPM_HASH = "35c767e49001c268883f2923eaf51824271482f81f42f647885fe015f199ca02932fa36faa1b0152010d1432c273b36a8f9b83228e561ab9c11f65bde40bacff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unamth-template"

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
