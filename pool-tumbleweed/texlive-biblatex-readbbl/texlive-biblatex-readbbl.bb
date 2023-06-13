SUMMARY = "Read a .bbl file created by biber"
DESCRIPTION = "This small package modifies the biblatex macro which reads a \
.bbl file created by Biber. It is thus possible to include a \
.bbl file into the main document with the filecontents \
environment and send it to a publisher who does not need to run \
the Biber program. However, when the bibliography changes one \
has to create a new .bbl file."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn61549"

RPM_NAME = "texlive-biblatex-readbbl-2023.201.0.0.01svn61549-53.1.noarch.rpm"
RPM_HASH = "5578499a5b9bfb46363fe809f11f0f5f79193e5a4974cba95c8f0b14ed4366ae6baa37bcacaa03c787de24852088420d3ce0457041f75c6f6cacc4708fed7901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(biblatex-readbbl.sty) \
texlive-biblatex-readbbl"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
