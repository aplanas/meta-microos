SUMMARY = "LaTeX interface for the CJK category codes of upTeX"
DESCRIPTION = "The package provides management of the CJK category code \
('kcatcode'> table of the upTeX extended TeX engine. Package \
options are available for tailored use in the cases of \
documents that are principally written in Japanese, or \
principally written in English or other Western languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn63967"

RPM_NAME = "texlive-pxcjkcat-2023.201.1.4svn63967-53.1.noarch.rpm"
RPM_HASH = "8ac7157ac49e02065efae4d672b47f24035fd1165aa4b4f115a72e678d28654f0f0a351d5647bb6a9f83f6ef50a6ebeed2041831d4e8a2aa6e5de0747a3ed328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pxcjkcat.sty) \
texlive-pxcjkcat"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
