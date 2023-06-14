SUMMARY = "Control table of contents, figures, etcetera"
DESCRIPTION = "Provides control over the typography of the Table of Contents, \
List of Figures and List of Tables, and the ability to create \
new 'List of ...'. The ToC \\parskip may be changed."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3jsvn53364"

RPM_NAME = "texlive-tocloft-2023.201.2.3jsvn53364-52.1.noarch.rpm"
RPM_HASH = "a93d63e02524686910c4638259feb0c7851c2b61ed89332e99e2f8cd0faed8c97ca957e92024c0cce09e71fa1cb5cc5909b9b8623ff5697a3a75df82e8c7843f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tocloft.sty \
texlive-tocloft"

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
