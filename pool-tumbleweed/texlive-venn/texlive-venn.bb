SUMMARY = "Creating Venn diagrams with MetaPost"
DESCRIPTION = "MetaPost macros for venn diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-venn-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "abcf21adf46b8abaae8614053bb12db3050005c7b089923daa9051ca2fc9127da80d8dad002880da8d70f5c4da879bf69b762b5a58e36c5081e30b1e6afb695a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venn"
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
