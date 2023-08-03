SUMMARY = "Directly compile \\include'd child documents"
DESCRIPTION = "This LaTeX2e package enables the direct compilation of document \
sections included by \\include to individual files."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn49543"

RPM_NAME = "texlive-childdoc-2023.209.2.0svn49543-54.1.noarch.rpm"
RPM_HASH = "2a8c3284919532914dd6f438ae5e1651b02afa99d5d84099758ee135623694c7396e215785a061317faa18228a5f2be4b7f2f91745d9f2224ed1ef22943d1ce8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-childdoc.def \
texlive-childdoc"

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
