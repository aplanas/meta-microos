SUMMARY = "Load properties from a file"
DESCRIPTION = "The package loads properties (key, value) from a properties \
file, e.g. \\jobname.properties."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-properties-2023.201.0.0.2svn15878-52.1.noarch.rpm"
RPM_HASH = "cde4530f8e5ad551422e6ddf2f7dc6e39f1aceda0909aed1781b2837c1db8784fffe45f3b526d7ad9de32e7c6420ba3e9d5047a29571b64d210bd9e2c7897238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(properties.sty) \
texlive-properties"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(datatool.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
