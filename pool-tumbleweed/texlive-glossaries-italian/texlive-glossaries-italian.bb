SUMMARY = "Italian language module for glossaries package"
DESCRIPTION = "Italian language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-italian-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "37022c6689eda0c315c7c4d68539671b7b4a00f789c12789ced6745671eb257962b13b7e9ef50fc1cf3eece21a563b3a02649f6f614770bedf732b3e59aae76f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-italian.ldf \
texlive-glossaries-italian"

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
