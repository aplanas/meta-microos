SUMMARY = "Embed Python code in LaTeX"
DESCRIPTION = "The package enables you to embed Python code in LaTeX, and \
insert the script's output in the document."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.22svn60162"

RPM_NAME = "texlive-python-2023.201.0.0.22svn60162-53.2.noarch.rpm"
RPM_HASH = "8f54f43543736734b454ae99b9a6b5966718c3050b61e6e76004c327b467858e4d12075e390aeafff59114c7650499cbb13e6c074a018a5a858ded309e299c11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-python.sty \
texlive-python"

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
