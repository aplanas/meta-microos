SUMMARY = "Keeping track of document versions"
DESCRIPTION = "The package enables the user to keep track of different \
versions of a LaTeX document. The command \\version prints the \
version and build numbers; each time you compile your document, \
the build number is increased by one. By placing \\version in \
the header or footer, each page can be marked with the unique \
build number describing the progress of your document."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn29370"

RPM_NAME = "texlive-mversion-2023.209.1.0.1svn29370-55.1.noarch.rpm"
RPM_HASH = "d93a2c1673745cd82b8da56a459a2ef29e6f0a389106e7fa986092fb7f01c798683847ebcde7ce20346dd56efa695f8193979688403196d685e8626f7b484086"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mVersion.sty \
texlive-mversion"

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
