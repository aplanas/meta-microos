SUMMARY = "Hooks for auxiliary files"
DESCRIPTION = "This package auxhook provides hooks for adding stuff at the \
begin of .aux files."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn53173"

RPM_NAME = "texlive-auxhook-2023.209.1.6svn53173-54.1.noarch.rpm"
RPM_HASH = "2853d1de853107ad5dea31085d527a5679788ade330646390318c44ac4e38352e1fb32638a11dacd87098cefbbf92d9a9730977329d346320a05c9d7f25e38a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-auxhook.sty \
texlive-auxhook"

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
