SUMMARY = "Generate BibTeX entries for various IETF index files"
DESCRIPTION = "The package provides scripts to translate IETF index files to \
BibTeX files."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn41332"

RPM_NAME = "texlive-ietfbibs-2023.209.1.0.0svn41332-54.1.noarch.rpm"
RPM_HASH = "1b4a26cf76143c651553932892558dcaeb74c7b6dc6bf63f51c7ccfd0e3f1b01f8eb49232ae27b7217e09295d676605b044ce37b96d0a58efa9c80547d5165fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ietfbibs"

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
