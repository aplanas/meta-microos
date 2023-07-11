SUMMARY = "Polyglossia support for Occitan"
DESCRIPTION = "Occitan language description file for polyglossia"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn52593"

RPM_NAME = "texlive-gloss-occitan-2023.201.0.0.1svn52593-53.2.noarch.rpm"
RPM_HASH = "a5d38599c11e5fd50f097a8f5632a39a05b2005d444134c29e72fa18ba105f865b83ecbcc36ce4c8fe757823d63231b78e47a8e4a606c641f0a278a02aa9b228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gloss-occitan"

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
