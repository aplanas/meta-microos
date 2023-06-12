SUMMARY = "A LaTeX course written in brazilian portuguese language"
DESCRIPTION = "This is a LaTeX2e course written in brazilian portuguese \
language."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5.8svn63374"

RPM_NAME = "texlive-latex-via-exemplos-2023.201.0.0.5.8svn63374-55.1.noarch.rpm"
RPM_HASH = "ade349021efedf3f205322fcc30565df75e4cb88e868c1a55ff9bb66b1d5a8d4d6d498f52f46680705cf5cc37191e6c3e91eacc0f6c3dfe85bd038670010bf27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-via-exemplos"
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
