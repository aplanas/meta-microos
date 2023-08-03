SUMMARY = "Construction plans in ConTeXt"
DESCRIPTION = "Generate a page with a figure at a well-defined scale."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-construction-plan-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "37c0e9af76c66806f4037a8f329f973b11a949584f8c1ef3150ddc272a09502ee70d7dd29410dc8248af5958d7e8795a6254680d9aab84006bbd56032d9bc7cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-construction-plan.tex \
texlive-context-construction-plan"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
