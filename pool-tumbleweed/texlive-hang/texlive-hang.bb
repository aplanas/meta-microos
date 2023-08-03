SUMMARY = "Environments for hanging paragraphs and list items"
DESCRIPTION = "This package provides environments for hanging paragraphs and \
list items. In addition, it defines environments for labeled \
paragraphs and list items."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn43280"

RPM_NAME = "texlive-hang-2023.209.2.1svn43280-54.1.noarch.rpm"
RPM_HASH = "e47429cb1b5a31b7002795d19265b402e42600283e9b56fd877e627cfc52b7c5ea72c98462898832ac7978b2e9417eaa5fe6c5f37b6143b96c7df0304c554b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hang.sty \
texlive-hang"

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
