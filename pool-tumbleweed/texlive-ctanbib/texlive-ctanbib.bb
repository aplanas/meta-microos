SUMMARY = "Export CTAN entries to bib format"
DESCRIPTION = "This package provides a Lua script which can be used for \
retrieving bibliographic information in BibLaTeX format for \
packages hosted on CTAN. The ctanbib script depends only on \
LuaXML."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2bsvn66068"

RPM_NAME = "texlive-ctanbib-2023.209.0.0.2bsvn66068-55.1.noarch.rpm"
RPM_HASH = "fc5a2dc51d8764bbba9ae20494e9f4af65b9ccb423e888fe4f16dd10af6b03bf8ba2778d600b2fc01371a3590962efbb5e66bdf39526824756e35f9b0cbb892b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctanbib"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-ctanbib-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
