SUMMARY = "Construction plans in ConTeXt"
DESCRIPTION = "Generate a page with a figure at a well-defined scale."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-construction-plan-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "ced77f31f3472fb21f458b9ded10b3770e917f06db040c9d9c41f9cfc789c0c3b920e39b8a92608ba2e48ca5a96236b42c3f883fbff6803fca11478fd07ad2bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(t-construction-plan.tex) \
texlive-context-construction-plan"
RDEPENDS:${PN} += "/bin/sh \
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
