SUMMARY = "Type 1 versions of wasy fonts"
DESCRIPTION = "Converted (Adobe Type 1) outlines of the wasy fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.001.002svn53534"

RPM_NAME = "texlive-wasy-type1-2023.201.001.002svn53534-53.1.noarch.rpm"
RPM_HASH = "710cbadf033e2c28fb3c08b0be05eda871e781e807e9e94a41b65878e87620c2548b7627105a11cf493096e644d3b2a5541606995bba316fa45517b0bd153947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(wasy.map) \
texlive-wasy-type1"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-wasy \
texlive-wasy-type1-fonts"

inherit rpm
