SUMMARY = "LaTeX interface for the CJK category codes of upTeX"
DESCRIPTION = "The package provides management of the CJK category code \
('kcatcode'> table of the upTeX extended TeX engine. Package \
options are available for tailored use in the cases of \
documents that are principally written in Japanese, or \
principally written in English or other Western languages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn63967"

RPM_NAME = "texlive-pxcjkcat-2023.209.1.4svn63967-54.1.noarch.rpm"
RPM_HASH = "31d0fbeca42baf8a92e61d6cc3c88ab003ede3dc7dee97e3c727cecb2a361ede99a7faebb256b778db226b06f4b5685b74bd61cfc5e50e9a7762e6b40b57f53f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pxcjkcat.sty \
texlive-pxcjkcat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
