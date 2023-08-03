SUMMARY = "Name authority mechanism for consistency in body text and index"
DESCRIPTION = "Publications, that reference many names, require editors and \
proofreaders to track those names in the text and index. The \
package offers name authority macros that allow authors and \
compilers to normalize occurrences of names, variant name \
forms, and pen names in the text and index. This may help \
minimize writing and production time and cost."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.7svn65738"

RPM_NAME = "texlive-nameauth-2023.209.3.7svn65738-55.1.noarch.rpm"
RPM_HASH = "d19bcd3d53d8054a2d354b0911f6e6d5f93f816e6b347b2cb5dcd21cc7bccc0a2ad0b4eba1e21c19d8caff4e4f1e183bffdf5c74bfe64280d533bee08ffbb3f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nameauth.sty \
texlive-nameauth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-suffix.sty \
tex-trimspaces.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
