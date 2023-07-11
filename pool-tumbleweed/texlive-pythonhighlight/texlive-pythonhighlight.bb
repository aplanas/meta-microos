SUMMARY = "Highlighting of Python code, based on the listings package"
DESCRIPTION = "Highlighting of Python code, based on the listings package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn43191"

RPM_NAME = "texlive-pythonhighlight-2023.201.svn43191-53.2.noarch.rpm"
RPM_HASH = "7c504b1d1e769b5ea19608887e9f6f2f82c23eee31e69c19f5bce949acdce632a6b0c596f0e980be01249a3767d75b8544cf7068f8661095f1eba1b7165cf9e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pythonhighlight.sty \
texlive-pythonhighlight"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
