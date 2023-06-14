SUMMARY = "Danish language module for glossaries package"
DESCRIPTION = "Danish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-danish-2023.201.1.0svn35665-53.1.noarch.rpm"
RPM_HASH = "b87c91bbd440f10c412c20e24db890f4dd1ae9391b5c846be7861014c339ebe9ee327b9cfefca492d883fd440ef81cfb5fd32a63b8699bf0243033f48663ec8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-danish.ldf \
texlive-glossaries-danish"

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
