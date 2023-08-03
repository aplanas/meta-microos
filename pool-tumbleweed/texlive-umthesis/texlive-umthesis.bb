SUMMARY = "Dissertations at the University of Michigan"
DESCRIPTION = "The class loads book class, and makes minimal changes to it; \
its coding aims to be as robust as possible, and as a result it \
has few conflicts with potential add-on packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-umthesis-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "d7ed6f0ba986965f934b140f9b09ed03e7df0b7e5762adf26dae94de24e9b095fda4db0c0986f7c99bc9c61fb20c738dc19eb0f25eee6d132e27a66d6059c0ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-umthesis.cls \
texlive-umthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-etex.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
