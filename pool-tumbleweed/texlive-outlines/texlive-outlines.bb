SUMMARY = "Produce 'outline' lists"
DESCRIPTION = "Defines an outline environment, which allows outline-style \
indented lists with freely mixed levels up to four levels deep. \
It replaces the nested begin/end pairs by different item tags \
\\1 to \\4 for each nesting level. This is very convenient in \
cases where nested lists are used a lot, such as for to-do \
lists or presentation slides."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn25192"

RPM_NAME = "texlive-outlines-2023.209.1.1svn25192-55.1.noarch.rpm"
RPM_HASH = "5a9cb4d9b5af9ae51529c253fe37140ab8037988348c83443eb1f3b449ac5cd8fa846b7b2bb5dff15fae435aafdb55be722943c09a1fab2f8b7e2e4cbad7d3f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-outlines.sty \
texlive-outlines"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
