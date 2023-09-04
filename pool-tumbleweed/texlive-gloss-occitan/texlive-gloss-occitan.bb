SUMMARY = "Polyglossia support for Occitan"
DESCRIPTION = "Occitan language description file for polyglossia"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn52593"

RPM_NAME = "texlive-gloss-occitan-2023.209.0.0.1svn52593-54.2.noarch.rpm"
RPM_HASH = "7e2ad226625a5f842ec3a617d652d22798f9ad357af67f6649fa9d016fa4cb2db909421b68f54d77c8bd11f504ebcd3a86b975ff18487016d7ecace7cc748811"
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
