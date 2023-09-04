SUMMARY = "If-then-else command for processing potentially empty arguments"
DESCRIPTION = "This package provides a command for the LaTeX programmer for \
testing whether an argument is empty."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn47544"

RPM_NAME = "texlive-ifmtarg-2023.209.1.2bsvn47544-54.1.noarch.rpm"
RPM_HASH = "e7f43ccb7aa8de22c610c11e9c828af32d672e3f3983db0a2a2b607b4236a07fc0ea0163f66f99eae10c8e6b20f46d128fd9502c631eec3436bebfb752fc9bef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifmtarg.sty \
texlive-ifmtarg"

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
